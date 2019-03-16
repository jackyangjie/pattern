package pattern.factory.simple_factory.facortymethod;

import pattern.factory.simple_factory.Computer;
import pattern.factory.simple_factory.ThinkPadCmputer;

public class ThinkPadFactory implements ComputerFactory {
    @Override
    public Computer create() {
        return new ThinkPadCmputer();
    }
}
