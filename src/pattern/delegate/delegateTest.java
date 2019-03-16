package pattern.delegate;

public class delegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss(new Leader());
        System.out.println( boss.commed("开发一个网站！"));
    }
}
