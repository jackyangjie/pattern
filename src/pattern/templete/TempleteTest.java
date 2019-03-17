package pattern.templete;

public class TempleteTest {
    public static void main(String[] args) {
//        CaffeineBeverage caffe = new Tea();
//        CaffeineBeverage caffe = new Coffee();

        CaffeineBeverage caffe = new CaffeineBeverage() {
            @Override
            protected void addCondiments() {
                System.out.println("加入佐料 辣椒");
            }

            @Override
            protected void brew() {
                System.out.println("把方便面放到碗里");
            }
        };

        caffe.prepareRecipe();




    }
}
