package reflect.dynamicload;

/**
 * Created by tang on 2015/12/6.
 */
public interface OfficeAble {
    public default void start(){
        System.out.println(this.getClass().getName()+" is default method,nothing to do.");
    }
}
