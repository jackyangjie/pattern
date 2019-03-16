package pattern.factory.simple_factory.abstractfactory;

public class AbstratFactoryTest {
    public static void main(String[] args) {
          AbstractFactory factory = new HuaweiFactory();
          factory.createComputer().myName();
          factory.createDisplay().name();
          factory.createMouseButtons().name();


    }

}
