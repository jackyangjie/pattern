package pattern.factory.simple_factory;

public class ThinkPadCmputer implements Computer {
    @Override
    public String myName() {
        System.out.println("我是 thinkPad");
        return null;
    }
}
