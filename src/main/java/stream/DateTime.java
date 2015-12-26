package stream;

import com.google.common.collect.Lists;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by tang on 2015/12/13.
 */
public class DateTime {
    public static void main(String[] args) {
        //		Long res = 1449975449118L; 2015-12-13 10:57:29
//		Long res = 1449936000000L; 2015-12-13 12:00:00
//		Long res = 1449939599000L; 2015-12-13 12:59:59
//		Long res = 1449982800000L;// 2015-12-13 01:00:00
//        Date dat=new Date(res);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        System.out.println(sdf.format(dat));
//        System.out.printf("Long value:%d , date:%s",res,sdf.format(dat));
//        Stream.of(1449936000000L, 1449939599000L,
//                1449982800000L,
//                1449972800000L,
//                1449512812000L,
//                1449986812800L,
//                1449982962340L,
//                1449982852845L)
//                .forEach(curTime -> {
//                    Date dat = new Date(curTime);
//                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
//                    System.out.printf("Long value:%d , date:%s \r\n", curTime, sdf.format(dat));
//                });
        DateTime dateTime = new DateTime();
        dateTime.testTime();
    }

    private  void testTime(){
        List<Long> timeList = Lists.newArrayList();
        for (int i = 0; i <10 ; i++) {
            long lSysTime = System.currentTimeMillis();
            timeList.add(lSysTime);
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        timeList.forEach(curTime -> {
            Date dat = new Date(curTime);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
            System.out.printf("Long value:%d , date:%s \r\n", curTime, sdf.format(dat));
        });
    }
}
