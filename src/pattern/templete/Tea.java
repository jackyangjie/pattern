package pattern.templete;

public class Tea extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("加入 柠檬 ");
    }

    @Override
    protected void brew() {
        System.out.println("冲泡  茶叶");
    }
}
