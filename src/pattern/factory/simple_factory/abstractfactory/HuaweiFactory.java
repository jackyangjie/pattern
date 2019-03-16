package pattern.factory.simple_factory.abstractfactory;

import pattern.factory.simple_factory.*;

public class HuaweiFactory extends AbstractFactory {
    @Override
    Computer createComputer() {
        return  new Computer() {
            @Override
            public String myName() {
                System.out.println("我是华为电脑");
                return null;
            }
        };
    }

    @Override
    LcdDisplay createDisplay() {
        return new HuaweiLCd();
    }

    @Override
    MouseButtons createMouseButtons() {
        return  new HuaWeiMouseButton();
    }
}
