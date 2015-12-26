package annotation.imooc;

import org.apache.commons.lang3.StringUtils;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 * User: TangWenWu
 * Date: 2015/12/26
 * Time: 10:09
 * CopyRight:HuiMei Engine
 */
public class TestAnnotation {
    /***********************注解 知识要点****************************************************
     *  视频地址：http://www.imooc.com/learn/456
     *  扩展知识： 注解（Annotation）--注解处理器 http://www.cnblogs.com/peida/archive/2013/04/26/3038503.html
     * 1.注解的分类：
     *   1.1 按运行机制： 源码注解     编译时注解    运行进注解
     *   1.2 按来源： JDK自带的注解    第三方注解    自定义注解
     *   1.3 按注解参数的个数：   标记注解  单值注解    完整注解
     *   1.4 元注解： 注解的注解
     *
     * 2.自定义注解
     *     2.1 参见 Description 注解
     *     2.2 成员方法 无参无异常方式声明
     *     2.3 可以使用default 为成员指定一个默认值
     *     2.4 成员方法的返回类型 是受限的， 合法类型： 原始类型，String,Class,Annotation,Enumeration 和 以上所有类型的数组
     *     2.5 如果注解只有一个成员方法，则方法名必须为 value() , 使用时可以忽略成员名和赋值号(=)
     *     2.6 注解类可以没有成员，没有成员的注解称为 标识注解
     *
     * 3. 元注解
     *    3.1 @Target 用于描述注解的使用范围
     *          1.CONSTRUCTOR:用于描述构造器
     *　　　　    2.FIELD:用于描述域
     *　　　　    3.LOCAL_VARIABLE:用于描述局部变量
     *　　　　    4.METHOD:用于描述方法
     *　　　　    5.PACKAGE:用于描述包
     *　　　　    6.PARAMETER:用于描述参数
     *　　　　    7.TYPE:用于描述类、接口(包括注解类型) 或enum声明
     *    3.2 @Retention：  表示需要在什么级别保存该注释信息，用于描述注解的生命周期（即：被描述的注解在什么范围内有效）
     *          1.SOURCE:在源文件中有效（即源文件保留）
     *　　　　    2.CLASS:在class文件中有效（即class保留）
     *　　　　    3.RUNTIME:在运行时有效（即运行时保留）
     *    3.3 @Inherited  元注解是一个标记注解，@Inherited阐述了某个被标注的类型是被继承的。如果一个使用了@Inherited修饰的annotation类型被用于一个class，则这个annotation将被用于该class的子类
     *       注意：@Inherited annotation类型是被标注过的class的子类所继承。类并不从它所实现的接口继承annotation，方法并不从它所重载的方法继承annotation。
     *
     *
     *
     *
     * *************************************************************************
     */
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setId(1);
        person1.setUserName("tangww");
        person1.setMobile("18611211989");

        Person person2 = new Person();
        person2.setMobile("18611211989");
        person2.setEmail("tangwwk@126.com");

        Person person3 = new Person();
        person3.setMobile("18611211989");
        person3.setNickName("文武");
        person3.setFullName("汤文武");

        System.out.println(query(person1));
        System.out.println(query(person2));
        System.out.println(query(person3));

    }

    private static String query(Person person) {
        StringBuffer sb = new StringBuffer("select * from ");
        Class cls = person.getClass();
        if(!cls.isAnnotationPresent(Table.class)){
            return null;
        }
        Table table = (Table) cls.getAnnotation(Table.class);
        sb.append(table.value()).append(" where 1=1 ");
        Field[] fields = cls.getDeclaredFields();
        Stream.of(fields).filter(fld -> fld.isAnnotationPresent(Column.class))
        .forEach(field -> {
            String columnName = field.getAnnotation(Column.class).value();
            Object columnValue ="";
            try {
                PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(),cls);
                Method getMethod = propertyDescriptor.getReadMethod();
//                Method setMethod = propertyDescriptor.getWriteMethod();
                columnValue = getMethod.invoke(person,null);
                if(null != columnValue || (columnValue instanceof Integer && (Integer) columnValue!=0)){
                    boolean likePro = field.getAnnotation(Column.class).useLike();
                    if(likePro){
                        sb.append(" and ").append(columnName).append(" like '%").append(columnValue).append("%' ");
                    }else {
                        sb.append(" and ").append(columnName).append(" ='").append(columnValue).append("' ");
                    }
                }

            } catch (IntrospectionException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });


        return sb.toString();
    }
}
