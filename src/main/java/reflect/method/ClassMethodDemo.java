package reflect.method;

import reflect.dynamicload.OfficeAble;
import reflect.dynamicload.Word;

/**
 * Created by tang on 2015/12/7.
 */
public class ClassMethodDemo {

    public static void main(String[] args) {
        String str ="";
        ClassUtils.getClassInfo(str);

//        Double dbl = 76.67;
//        ClassUtils.getClassInfo(dbl);
        OfficeAble officeAble = new Word();
        ClassUtils.getClassInfo(officeAble);
    }
}
