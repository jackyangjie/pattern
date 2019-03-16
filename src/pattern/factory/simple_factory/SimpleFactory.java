package pattern.factory.simple_factory;

public final class SimpleFactory {



    public static Computer getComputer(String name){
        if("xiaomi".equals(name))return new XiaomiCmputer();
          else if("mac".equals(name)) return new MacComputer();
          else return new ThinkPadCmputer();
    }
}
