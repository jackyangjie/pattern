package pattern.factory.simple_factory;

public class LenovoMouseButton implements  MouseButtons{
    @Override
    public void name() {
        System.out.println("联想鼠标");
    }
}
