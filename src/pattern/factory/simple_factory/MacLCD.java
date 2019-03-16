package pattern.factory.simple_factory;

public class MacLCD implements  LcdDisplay {
    @Override
    public void name() {
        System.out.println("我是 苹果 显示器");
    }
}
