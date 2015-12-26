package reflect.method;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

/**
 * Created by tang on 2015/12/7.
 */
public class ClassUtils {
    public static void getClassInfo(Object obj){
        Class cls = obj.getClass();
        System.out.println("类的名称====="+cls.getName());
        Method[] methods = cls.getMethods();
//      获得类自己定义的方法，不包括继承的方法   cls.getDeclaredMethods();
        System.out.println("类的方法=====");
        Arrays.stream(methods).forEach(method -> {
            System.out.printf("%s %s(",method.getReturnType().getName(),method.getName());
            Class[] paramTypes = method.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.printf("%s ,",paramType.getName());
            }
            System.out.println(")");
        });

//        获得 类的属性  cls.getFields();
        System.out.println("类的属性=====");
        Field[] fields =  cls.getDeclaredFields();
        Arrays.stream(fields).forEach(field -> {
            Class fieldType = field.getType();
            String typeName = fieldType.getName();
            System.out.printf("%s %s; \r\n",typeName,field.getName());
        });

        System.out.println("类的构造函数=====");
        Constructor[] constructors = cls.getDeclaredConstructors();
        Arrays.stream(constructors).forEach(constructor -> {
            System.out.print(constructor.getName() +"(");
            Class[] paramTypes = constructor.getParameterTypes();
            Parameter[]  parameters= constructor.getParameters();
            for (int i = 0; i < paramTypes.length; i++) {
                System.out.printf("%s %s,",paramTypes[i].getName(),parameters[i].getName());
            }

            System.out.println(")");
        });
    }
}
