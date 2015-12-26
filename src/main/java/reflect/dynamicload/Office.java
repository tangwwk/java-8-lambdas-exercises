package reflect.dynamicload;

/**
 * Created by tang on 2015/12/6.
 */
public class Office {
    public static void main(String[] args) {
        if("Word".equals(args[0])){
            Word word = new Word();
            word.start();
        }
        if("Excel".equals(args[0])){
            Excel excel = new Excel();
            excel.start();
        }
    }
}
