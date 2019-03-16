package pattern.factory.simple_factory.facortymethod;

import pattern.factory.simple_factory.Computer;
import pattern.factory.simple_factory.MacComputer;

public class XiaomiFactory implements ComputerFactory {
    @Override
    public Computer create() {
        return new MacComputer();
    }
}
