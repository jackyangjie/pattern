package pattern.templete;

public class Coffee extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("加入牛奶和糖");
    }

    @Override
    protected void brew() {
        System.out.println("冲泡磨好的咖啡粉");
    }
}
