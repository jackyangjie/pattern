package pattern.strategy;

public class QQLogin implements LoginType {
    @Override
    public String loginMethod() {
        System.out.println("我是 qq 登录");
        return "QQ";
    }
}
