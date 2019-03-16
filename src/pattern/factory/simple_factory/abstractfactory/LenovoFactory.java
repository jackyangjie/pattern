package pattern.factory.simple_factory.abstractfactory;

import pattern.factory.simple_factory.*;

public class LenovoFactory extends AbstractFactory {
    @Override
    Computer createComputer() {
        return new ThinkPadCmputer();
    }

    @Override
    LcdDisplay createDisplay() {
        return new LcdDisplay() {
            @Override
            public void name() {
                System.out.println("我是联系 显示器");
            }
        };
    }

    @Override
    MouseButtons createMouseButtons() {
        return new LenovoMouseButton();
    }
}
