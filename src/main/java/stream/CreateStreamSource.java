package stream;


import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by tang on 2015/12/10.
 */
public class CreateStreamSource {

    public static void main(String[] args) {
        //多种方式生成 Stream Source
        //从 Collection 和数组
        Collection collection = new ArrayList<>();
        collection.stream();
        collection.parallelStream();

        Arrays.stream(new int[]{1,4,6,7,8});
        Stream.of(1,2,6,8,9);
        //从 BufferedReader
//        BufferedReader bufferedReader= new BufferedReader(null);
//        bufferedReader.lines();

        //静态工厂
        IntStream.range(1,10).forEach(System.out :: println);
//        Files files = null;
//        files.walk();

        //自己构建
        //Spliterator spliterator =

        //其它
        Random random = new Random();
        random.ints().limit(10).forEach(System.out :: println);

        BitSet bitSet = new BitSet();
        bitSet.stream();
//        Pattern pattern = new Pattern();
//        pattern.splitAsStream('c');

        //构造流的几种常见方法

        // 1. Individual values
        Stream stream = Stream.of("a", "b", "c");
        // 2. Arrays
        String [] strArray = new String[] {"a", "b", "c"};
        stream = Stream.of(strArray);
        stream = Arrays.stream(strArray);
        // 3. Collections
        List<String> list = Arrays.asList(strArray);
        stream = list.stream();

        //数值流的构造
        IntStream.of(new int[]{1, 2, 3}).forEach(System.out::println);
        IntStream.range(1, 3).forEach(System.out::println);
        IntStream.rangeClosed(1, 3).forEach(System.out::println);

        //流转换为其它数据结构
        // 1. Array

//        String[] strArray1 = stream2.toArray(String[]::new);
//// 2. Collection
//        List<String> list1 = stream2.collect(Collectors.toList());
//        List<String> list2 = stream2.collect(Collectors.toCollection(ArrayList::new));
//        Set set1 = stream2.collect(Collectors.toSet());
//        Stack stack1 = stream2.collect(Collectors.toCollection(Stack::new));
//// 3. String
//        String str = stream2.collect(Collectors.joining()).toString();

    }
}
