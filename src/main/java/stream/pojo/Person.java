package stream.pojo;

/**
 * Created by tang on 2015/12/12.
 */
public class Person {
    public int no;
    private String name;
    private int age;
    public Person (int no, String name) {
        this.no = no;
        this.name = name;
    }
    public Person (int no, String name,int age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }

    public String getName() {
//        System.out.println(name);
        return name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
