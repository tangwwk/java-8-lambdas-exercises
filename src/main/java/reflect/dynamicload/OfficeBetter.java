package reflect.dynamicload;

/**
 * Created by tang on 2015/12/6.
 */
//编译时刻 加载类是静态加载类；
//运行时刻加载类是动态加载类;
public class OfficeBetter {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("reflect.dynamicload."+ args[0]);

            // 此处如果为 Excel  则会报类型转换异常，应如何处理呢？   面向接口编程
//            Word word = (Word)cls.newInstance();
//            word.start();

            //通过接口来实例化，调用具体实现类的方法  定义一个接口，不同类型的对象可以实现该接口，以确保动态加载类时强转类型的一致性；
            OfficeAble able = (OfficeAble)cls.newInstance();
            able.start();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
