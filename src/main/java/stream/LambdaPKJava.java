package stream;

import com.google.common.collect.Lists;
import stream.pojo.Transaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Created by tang on 2015/12/10.
 */
public class LambdaPKJava {
    static List<Transaction> transactions = Lists.newArrayList();
    static{
        for (int i = 0; i < 1000000; i++) {
            Transaction t = new Transaction();
            t.setId(i);
//            t.setType(i % 2);
            t.setType(1);
            t.setValue(i * 3.1415926);
            transactions.add(t);
        }
    }

    public static void main(String[] args) {
        LambdaPKJava lambdaPKJava = new LambdaPKJava();
        long start = System.nanoTime();//获取系统开始排序的时间点
        List<Double> transactionIds =lambdaPKJava.orderTransactionByJava();
        System.out.println("java result:"+transactionIds.size());
        long end = System.nanoTime();//获取系统结束排序的时间点
        long ms = TimeUnit.NANOSECONDS.toMillis(end-start);//得到串行排序所用的时间
        System.out.println(ms+"ms used,by java");

        long start2 = System.nanoTime();//获取系统开始排序的时间点
        List<Double> transValues = lambdaPKJava.orderTransactionByLambda();
        System.out.println("lambda result:"+transValues.size());
        long end2 = System.nanoTime();//获取系统结束排序的时间点
        long ms2 = TimeUnit.NANOSECONDS.toMillis(end2-start2);//得到串行排序所用的时间
        System.out.println(ms2+"ms used,by lambda");

    }

    private List<Double> orderTransactionByLambda(){
        return transactions.stream()
                .filter(t -> t.getType() == Transaction.GROCERY)
                .sorted(Comparator.comparing(Transaction :: getValue ).reversed())
                .map(Transaction :: getValue)
                .collect(Collectors.toList());
    }

    private List<Double>  orderTransactionByJava(){
        List<Transaction> groceryTransactions = new ArrayList<>();
        for(Transaction t: transactions){
            if(t.getType() == Transaction.GROCERY){
                groceryTransactions.add(t);
            }
        }
        Collections.sort(groceryTransactions, new Comparator<Transaction>(){
            public int compare(Transaction t1, Transaction t2){
                return t2.getValue().compareTo(t1.getValue());
            }
        });
        List<Integer> transactionIds = new ArrayList<>();
        List<Double> transactionValues = new ArrayList<>();
        for(Transaction t: groceryTransactions){
            transactionIds.add(t.getId());
            transactionValues.add(t.getValue());
        }
        return transactionValues;
    }


}
