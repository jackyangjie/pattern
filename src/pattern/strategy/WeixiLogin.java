package pattern.strategy;

public class WeixiLogin implements LoginType {
    @Override
    public String loginMethod() {
        System.out.println("我是 微信 登录");
        return "微信";
    }
}
