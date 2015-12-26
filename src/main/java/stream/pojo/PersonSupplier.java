package stream.pojo;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Created by tang on 2015/12/13.
 */
public class PersonSupplier implements Supplier<Person>{

    private int index = 0;
    private Random random = new Random();

    @Override
    public Person get() {
        return new Person(index++,"StormTestUser"+index,random.nextInt(100));
    }
}
