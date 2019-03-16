package pattern.factory.simple_factory;

public class MacComputer implements Computer {
    @Override
    public String myName() {
        System.out.println("我是  mac");
        return null;
    }
}
