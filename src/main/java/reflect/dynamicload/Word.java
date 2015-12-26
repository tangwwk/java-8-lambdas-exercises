package reflect.dynamicload;

import java.util.List;

/**
 * Created by tang on 2015/12/6.
 */
public class Word implements OfficeAble{
    public void start() {
        System.out.println(this.getClass().getName() +"---start....");
    }
    public List<Word> getWordList(Word word){
        return null;
    }
}
