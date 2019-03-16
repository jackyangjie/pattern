package pattern.strategy;

public class BaiDuWangPanLogin {



    public void login(LoginType loginType){

        System.out.println("欢迎使用 "+loginType.loginMethod()+"登录百度网盘！");
    }

}
