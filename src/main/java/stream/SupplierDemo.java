package stream;

import stream.pojo.PersonSupplier;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by tang on 2015/12/13.
 */
public class SupplierDemo {

    public static void main(String[] args) {
        SupplierDemo supplierDemo = new SupplierDemo();
//        supplierDemo.generateStream();
//        supplierDemo.generateBySupplier();
        supplierDemo.useIterate();

    }


    private  void generateBySupplier(){
        Stream.generate(new PersonSupplier())
                .limit(10)
                .forEach(person -> System.out.println(person.getName()+"--"+person.getAge()));
    }

    private void generateStream(){
        Random seed = new Random();
        Supplier<Integer> ages = seed :: nextInt;
        Stream.generate(ages).limit(5).forEach(System.out :: println);

        //Another way

//        IntStream.generate(() -> (int)(System.nanoTime() % 100))
//                .limit(5).forEach(System.out :: println);
    }

    private void useIterate(){
        Stream.iterate(0,n ->n+3).limit(10).forEach(x -> System.out.print(x + " "));
    }
}
