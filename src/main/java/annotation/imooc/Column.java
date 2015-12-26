package annotation.imooc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * User: TangWenWu
 * Date: 2015/12/26
 * Time: 10:06
 * CopyRight:HuiMei Engine
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    String value();

    boolean useLike() default false;
}
