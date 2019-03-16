package pattern.protortype;

import java.util.List;

public class SimplePrototype implements Prototype {

    private String name;
    private int age;
    private String sex;
    private List<String> list;

    public String getName() {
        return name;
    }

    public SimplePrototype setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public SimplePrototype setAge(int age) {
        this.age = age;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public SimplePrototype setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public List<String> getList() {
        return list;
    }

    public SimplePrototype setList(List<String> list) {
        this.list = list;
        return this;
    }

    @Override
    public Prototype clone() {
         return new SimplePrototype().setSex(this.sex).setName(this.name).setAge(this.age).setList(this.list);
    }
}
