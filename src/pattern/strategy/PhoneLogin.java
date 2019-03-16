package pattern.strategy;

public class PhoneLogin implements LoginType {
    @Override
    public String loginMethod() {
        System.out.println("我是 手机号 登录");
        return "手机号";
    }
}
