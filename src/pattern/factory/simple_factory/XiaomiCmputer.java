package pattern.factory.simple_factory;

public class XiaomiCmputer implements Computer {
    @Override
    public String myName() {
        System.out.println("我是 小米");
        return null;
    }
}
