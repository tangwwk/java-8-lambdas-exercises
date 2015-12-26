package reflect.dynamicload;

/**
 * Created by tang on 2015/12/6.
 */
public class Excel implements  OfficeAble{
    public void start() {
        System.out.println(this.getClass().getName() +"---start....");
    }
}
