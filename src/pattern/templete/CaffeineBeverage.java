package pattern.templete;

public abstract class CaffeineBeverage {

     final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    protected void pourInCup() {
        System.out.println("把饮料 加入到杯子中去！");
    }

    protected abstract void brew();

    protected void boilWater() {
        System.out.println("选把 水 烧开！");

    }
}
