package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by tang on 2015/12/13.
 */
public class DistinctAndMax {

    public static void main(String[] args) throws IOException {
        DistinctAndMax distinctAndMax = new DistinctAndMax();
//        distinctAndMax.useMax();
        distinctAndMax.useDistinct();
    }

    private void useMax() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c:\\hm\\linux.log"));
        int longest = br.lines().
//                peek(System.out :: println).
                mapToInt(String::length).
                max().
                getAsInt();
        br.close();
        System.out.println(longest);
    }

    private void useDistinct() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("c:\\hm\\linux.log"));
        List<String> allStrs = br.lines()
                .flatMap(line -> Stream.of(line.split(" ")))
                .filter(str -> str.length() >0)
                .map(String :: toLowerCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(allStrs);
    }
}
