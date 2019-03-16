package pattern.delegate;

public class BEmptyee implements IEmptyee {
    @Override
    public String skill(String commed) {
        System.out.println("我是B我做"+commed+"开发");
          return "完成";
    }
}
