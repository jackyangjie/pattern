package pattern.sigletion.lazy.regiest;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionSigletion {

    private final static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static synchronized Object getBean(String className){
        if(!ioc.containsKey(className)){
            try {
                Class<?> cla = CollectionSigletion.class.getClass().getClassLoader().loadClass(className);
                ioc.put(className,cla.newInstance());
            } catch (InstantiationException |IllegalAccessException|ClassNotFoundException  e) {
                e.printStackTrace();
            }
        }
        return ioc.get(className);

    }
}
