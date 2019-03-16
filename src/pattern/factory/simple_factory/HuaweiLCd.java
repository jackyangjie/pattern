package pattern.factory.simple_factory;

public class HuaweiLCd implements  LcdDisplay {
    @Override
    public void name() {
        System.out.println("我是 华为显示器");
    }
}
