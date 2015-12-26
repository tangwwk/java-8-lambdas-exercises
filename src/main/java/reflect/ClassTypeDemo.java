package reflect;

/**
 * Created by tang on 2015/12/6.
 */
public class ClassTypeDemo {
    public static void main(String[] args) {
        ClassType classType = new ClassType();
        classType.hello();

        Class c1 = ClassType.class;

        Class c2 = classType.getClass();

        System.out.println(c1 == c2);

        try {
            Class c3 = Class.forName("reflect.ClassType");
            System.out.println(c2 == c3);
            ClassType cType = (ClassType)c3.newInstance();
            cType.hello();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class ClassType{
    public void hello(){
        System.out.println("ClassType Three method!");
    }
}
