package pattern.protortype;

public class Test {

    public static void main(String [] args){
        SimplePrototype p = new SimplePrototype();
        p.setAge(23);
        p.setName("zhs");
        p.setSex("ts");
        SimplePrototype c = (SimplePrototype)p.clone();
        System.out.println(p +" "+p.getName());
        System.out.println(c+" "+c.getName());

    }
}
