package pattern.factory.simple_factory.facortymethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        ComputerFactory factory = new MacFactory();
        factory.create().myName();
    }
}
