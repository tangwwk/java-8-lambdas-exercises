package stream;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * Created by tang on 2015/12/10.
 * form:http://www.ibm.com/developerworks/cn/java/j-lo-java8streamapi/
 */
public class OperateStream {
    /*当把一个数据结构包装成 Stream 后，就要开始对里面的元素进行各类操作了。常见的操作可以归类如下。
    Intermediate：
    map (mapToInt, flatMap 等)、 filter、 distinct、 sorted、 peek、 limit、 skip、 parallel、 sequential、 unordered
    Terminal：
    forEach、 forEachOrdered、 toArray、 reduce、 collect、 min、 max、 count、 anyMatch、 allMatch、 noneMatch、 findFirst、 findAny、 iterator
    Short-circuiting：
    anyMatch、 allMatch、 noneMatch、 findFirst、 findAny、 limit*/
    static List<String> wordList = Lists.newArrayList();
    static{
        String words ="forEach,forEachOrdered,toArray,reduce,collect,min,max,count,anyMatch,allMatch,noneMatch,findFirst,findAny,iterator";
        wordList = Arrays.asList(words.split(","));
    }

    public static void main(String[] args) throws IOException {
        OperateStream operateStream = new OperateStream();
//        operateStream.streamMap();
//        operateStream.streamFlatMap();
//        operateStream.streamFilter();
//        operateStream.streamPeek();
//        operateStream.useOptional();
//        operateStream.streamReduce();
        operateStream.streamReduce();
    }

    private  void streamMap(){
        List<String> upCaseList = wordList.stream().map(String :: toUpperCase).collect(toList());
        System.out.println("upCaseList =="+upCaseList);

        Set<Integer> nums = Sets.newHashSet(1,2,3,4);
        Set<Integer> squareNums = nums.stream().map(n -> n*n).collect(toSet());
        System.out.println("squareNums =="+squareNums);
    }

    private void streamFlatMap(){
        Stream<List<String>> listStream = Stream.of(
                Arrays.asList("listStr","testStrs"),
                Arrays.asList("abcStr","strZXC"),
                Arrays.asList("listsQWE","abCStr")
        );
        Set<String> strSet = listStream.flatMap(strings -> strings.stream())
                .map(String :: toUpperCase)
                .collect(toSet());
        System.out.println("strSet =="+strSet);
    }

    private void streamFilter() throws IOException {
        // Files.readAllLines(Paths.get("D:\\hm_wspace\\java-8-lambdas-exercises\\test_file")).stream()
        List<String> words = Files.lines(Paths.get("D:\\hm_wspace\\java-8-lambdas-exercises\\test_file"))
                .flatMap(line -> Stream.of(line.split(" ")))
                .filter(word -> word.length() >0).collect(toList());
        System.out.println("file words=="+words);
    }

    private void streamPeek(){
        List<String> peekList = Stream.of("one","two", "three", "four","five")
                .filter(str -> str.length()>3)
                .peek(System.out :: println)
                .map(upStr -> upStr.toUpperCase())
                .peek(System.out :: println)
                .collect(toList());
    }

    private void useOptional(){
        String strA=" abcd ",strB=null;
        println(strA);
        println(strB);
        System.out.println(getLength(strA));
        System.out.println(getLength(strB));

    }

    private static void println(String text){
        Optional.ofNullable(text).ifPresent(System.out::println);
    }

    private static int getLength(String text){
        return Optional.ofNullable(text).map(String :: length).orElse(-1);
    }

    private void streamReduce(){
        // 字符串连接，concat = "ABCD"
        String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
        System.out.println("streamReduce--concat=" + concat);
// 求最小值，minValue = -3.0
        double minValue = Stream.of(-1.5, 1.0, -3.0, -2.0).reduce(Double.MAX_VALUE, Double::min);
// 求和，sumValue = 10, 有起始值
        int sumValue = Stream.of(1, 2, 3, 4).reduce(0, Integer::sum);
// 求和，sumValue = 10, 无起始值
        sumValue = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();
// 过滤，字符串连接，concat = "ace"
        concat = Stream.of("a", "B", "c", "D", "e", "F").
                filter(x -> x.compareTo("Z") > 0).
                reduce("", String::concat);
    }
}
