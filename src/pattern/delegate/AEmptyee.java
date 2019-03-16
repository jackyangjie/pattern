package pattern.delegate;

public class AEmptyee implements IEmptyee {
    @Override
    public String skill(String commed) {
        System.out.println("我是A  做"+commed+"开发");
          return "完成";
    }
}
