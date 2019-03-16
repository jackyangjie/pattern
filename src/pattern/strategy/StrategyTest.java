package pattern.strategy;

public class StrategyTest {
    public static void main(String[] args) {

        BaiDuWangPanLogin wangpan = new BaiDuWangPanLogin();
        LoginType type = new QQLogin();
        wangpan.login(type);


        wangpan.login(() ->{
                System.out.println("我是微博 登录");
                return "微博";
        });

    }


}
