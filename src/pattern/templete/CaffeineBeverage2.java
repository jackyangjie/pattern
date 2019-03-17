package pattern.templete;

public interface CaffeineBeverage2 {

    default void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void addCondiments();

    default void pourInCup() {
        System.out.println("把饮料 加入到杯子中去！");
    }

    void brew();

    default void boilWater() {
        System.out.println("选把 水 烧开！");

    }
}
