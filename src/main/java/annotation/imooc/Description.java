package annotation.imooc;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: TangWenWu
 * Date: 2015/12/26
 * Time: 11:50
 * CopyRight:HuiMei Engine
 */
@Target({ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.METHOD,ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited  //允许子类继承
@Documented
public @interface Description {

    String value();

    String user() default "tangwenwu";

    int times() default 5;
}
