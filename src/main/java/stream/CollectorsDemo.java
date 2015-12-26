package stream;

import stream.pojo.Person;
import stream.pojo.PersonSupplier;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by tang on 2015/12/13.
 */
public class CollectorsDemo {
    public static void main(String[] args) {
        CollectorsDemo collectorsDemo = new CollectorsDemo();
//        collectorsDemo.useGroupingBy();
        collectorsDemo.usePartitioningBy();
    }


    private void useGroupingBy(){
        Map<Integer,List<Person>> personMaps = Stream.generate(new PersonSupplier())
                .limit(100)
                .collect(Collectors.groupingBy(Person :: getAge));
        personMaps.entrySet().forEach(persons ->{
            System.out.printf("Age:%d ,List size:%d \r\n",persons.getKey(),persons.getValue().size());
            persons.getValue().stream().forEach(person -> {
                System.out.println("----Person name="+person.getName()+" age="+person.getAge());
            });
        });
    }

    private void usePartitioningBy(){
        //partitioningBy 其实是一种特殊的 groupingBy，它依照条件测试的是否两种结果来构造返回的数据结构,
        //  get(true) 和 get(false) 能即为全部的元素对象。
        Map<Boolean,List<Person>> children = Stream.generate(new PersonSupplier())
                .limit(100)
                .collect(Collectors.partitioningBy(person -> person.getAge() <18));
        System.out.println("Children nums:" + children.get(true).size());
        System.out.println("Adult nums:" + children.get(false).size());
    }
}
