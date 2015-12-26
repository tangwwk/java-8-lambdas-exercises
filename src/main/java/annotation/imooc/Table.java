package annotation.imooc;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: TangWenWu
 * Date: 2015/12/26
 * Time: 10:03
 * CopyRight:HuiMei Engine
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Table {

    String value();
}
