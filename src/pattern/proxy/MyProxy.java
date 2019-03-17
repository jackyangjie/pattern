package pattern.proxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class MyProxy {

    public static final String ln = "\r\n";

    public static Object newProxyInstance(MyClassLoad classLoad, Class<?>[] inteface, MyInvocationHandle handle) {
        //1.根据接口创建实现类

        try {
            String javaSrc = createJavaFile(inteface);
            String path = MyProxy.class.getResource("").getPath();
            File f = new File(path+ "/$Proxy0.java");

            FileWriter fw = new FileWriter(f );
            fw.write(javaSrc);
            fw.flush();
            fw.close();

            //2.编译 创建出来的java 文件
            JavaCompiler jc = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager sjfm = jc.getStandardFileManager(null, null, null);
            Iterable iterable = sjfm.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = jc.getTask(null, sjfm, null, null, null, iterable);
            task.call();
            sjfm.close();
            Class<?> proxyClasz = classLoad.findClass("$Proxy0");
            Constructor<?> c = proxyClasz.getConstructor(MyInvocationHandle.class);

           return c.newInstance(handle);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }


    public static String createJavaFile(Class<?>[] inteface) {
        StringBuffer sb = new StringBuffer();
        sb.append("package pattern.proxy;").append(ln);
        sb.append("import  java.lang.reflect.*;").append(ln);
        sb.append("public class $Proxy0 implements ").append(inteface[0].getName()).append("{").append(ln);
        sb.append(" MyInvocationHandle h;");
        sb.append("public $Proxy0(MyInvocationHandle h){").append(ln);
        sb.append("this.h = h;").append(ln);
        sb.append("}").append(ln);

        for (Method m : inteface[0].getMethods()) {
            Class<?>[] params = m.getParameterTypes();
            StringBuffer paramClasss = new StringBuffer();
            StringBuffer paramNames = new StringBuffer();
            StringBuffer paramValues = new StringBuffer();
            for (int i = 0; i < params.length; i++) {
                Class<?> clazz = params[i];
                String type = clazz.getName();
                String paramName = toLowerFirstCase(clazz.getSimpleName());
                paramNames.append(type + " " + paramName);
                paramValues.append(paramName);
                paramClasss.append(clazz.getName() + ".class");
                if (i > 0 && i < params.length - 1) {
                    paramNames.append(",");
                    paramClasss.append(",");
                    paramValues.append(",");
                }
            }

            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + " (" + paramValues.toString() + " ){").append(ln);
            sb.append("try{").append(ln);
            sb.append("Method m = " + inteface[0].getName() + ".class.getMethod(\"" + m.getName() + "\", new Class[] {" + paramClasss.toString() + "});").append(ln);
            sb.append((hasReturnValue(m.getReturnType()) ? " return" : "") + getCaseCode(" this.h.invoke(this,m,new Object[]{" + paramValues + "})", m.getReturnType()) + ";" + ln);
            sb.append("} catch(Error _ex) {}");
            sb.append(" catch(Throwable e){" + ln);
            sb.append(" throw new UndeclaredThrowableException(e);" + ln);
            sb.append("}");
            sb.append(getReturnEmptyCode(m.getReturnType()));
            sb.append("}").append(ln);
        }
        sb.append("}" + ln);
        return sb.toString();
    }

    private static Map<Class, Class> mappings = new HashMap<>();

    static {
        mappings.put(int.class, Integer.class);
    }


    private static String getReturnEmptyCode(Class<?> returnClass) {
        if (mappings.containsKey(returnClass)) return " return 0;";
        else if (returnClass == void.class) return "";
        else return " return null;";
    }

    private static String getCaseCode(String code, Class<?> returnClass) {
        if (mappings.containsKey(returnClass)) {
            return "((" + mappings.get(returnClass).getName() + ")" + code + ")." + returnClass.getSimpleName() + " Value()";
        }
        return code;
    }

    private static boolean hasReturnValue(Class<?> clazz) {
        return clazz != void.class;
    }

    private static String toLowerFirstCase(String name) {
        char[] chars = name.toCharArray();
        chars[0] += 32;
        return new String(chars);
    }
}
