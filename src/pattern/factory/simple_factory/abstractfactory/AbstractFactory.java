package pattern.factory.simple_factory.abstractfactory;

import pattern.factory.simple_factory.Computer;
import pattern.factory.simple_factory.LcdDisplay;
import pattern.factory.simple_factory.MouseButtons;

public abstract class AbstractFactory {

    abstract Computer createComputer();

    abstract LcdDisplay createDisplay();
    abstract MouseButtons createMouseButtons();

}
