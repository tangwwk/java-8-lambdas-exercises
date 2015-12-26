package stream;

import stream.pojo.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tang on 2015/12/12.
 */
public class LimitAndSkipSorted {
    static List<Person> persons = new ArrayList();
    static{
        for (int i = 0; i <10 ; i++) {
            Person person = new Person(i,"name"+i);
            persons.add(person);
        }
    }

    public static void main(String[] args) {
        LimitAndSkipSorted limitAndSkip = new LimitAndSkipSorted();
//        limitAndSkip.useLimitAtSortedAfter();
        limitAndSkip.userLimitAtSortedBefore();
    }


    private void useLimitAndSkip(){
        List<String> names = persons.stream().map(Person ::getName).limit(10).skip(4).collect(Collectors.toList());
        System.out.println(names);
    }

    /**
     * limit 和 skip 对 sorted 后的运行次数无影响
     *  limit/skip 无法达到 short-circuiting 目的的，就是把它们放在 Stream 的排序操作后，
     *  原因跟 sorted 这个 intermediate 操作有关：此时系统并不知道 Stream 排序后的次序如何，
     *  所以 sorted 中的操作看上去就像完全没有被 limit 或者 skip 一样。
     */
    private void useLimitAtSortedAfter(){
        List<Person> sortPerson = persons.stream()
            .sorted((p1,p2) ->p1.getName().compareTo(p2.getName()))
            .limit(4)
            .collect(Collectors.toList());
        System.out.println(sortPerson);
    }

    /**
     * 优化：排序前进行 limit 和 skip
     */
    private  void userLimitAtSortedBefore(){
        List<Person> sortPerson = persons.stream()
                .limit(3)
                .sorted((p1,p2) ->p1.getName().compareTo(p2.getName()))
                .collect(Collectors.toList());
        System.out.println(sortPerson);
    }
}
