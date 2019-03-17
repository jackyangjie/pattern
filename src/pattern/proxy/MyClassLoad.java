package pattern.proxy;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.rmi.server.ExportException;

public class MyClassLoad extends ClassLoader {



    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        //className 类的全路径
        String className = MyClassLoad.class.getPackage().getName()+"."+name;
        //编译后  的 class文件路径
        String classFilePath = MyClassLoad.class.getResource("").getPath().replace("\\.", "/") +name+".class";
            File clas = new File(classFilePath);
            try {
                if (clas.exists()) {
                    FileInputStream fis = new FileInputStream(clas);
                    ByteArrayOutputStream out = new ByteArrayOutputStream();
                    byte[] b = new byte[1024];
                    int len;
                    while ((len = fis.read(b)) != -1) {
                        out.write(b, 0, len);
                    }
                    return defineClass(className, out.toByteArray(), 0, out.size());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        return null;
    }
}
