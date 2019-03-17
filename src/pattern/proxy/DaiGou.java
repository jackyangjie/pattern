package pattern.proxy;

import java.lang.reflect.Method;

public class DaiGou implements  MyInvocationHandle{

    private Person target;

    public DaiGou(Person target) {
        this.target = target;
    }


    public Person getPoxyObject(){
       Person proxy = (Person) MyProxy.newProxyInstance(new MyClassLoad(),target.getClass().getInterfaces(),this);
       return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      before();
        Object object = method.invoke(target, args);
        after();

        return object;
    }

    private void before(){
        System.out.println("代购前 ，选办理 出入境 证件！");

    }

    private void after(){
        System.out.println("最后 要 付钱！");
    }
}
