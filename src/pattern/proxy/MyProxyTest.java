package pattern.proxy;

public class MyProxyTest {

    public static void main(String[] args) {

       Person person = (() ->{
           System.out.println("我想买个iphon");
          return "";
       });

       DaiGou dg =new DaiGou(person);
        Person proxyDg = dg.getPoxyObject();
        proxyDg.buy();

        System.out.println(2);

    }
}
