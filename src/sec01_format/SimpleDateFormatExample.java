package sec01_format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

    public static void main(String[] args) {

        //현재 시각
        Date now = new Date();
        System.out.println(now);

        //년,월,일,시,분,초
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd hh : mm : ss");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a HH:mm:ss");
        System.out.println(sdf.format(now));


        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf.format(now));
        //format중에 D는 올해 1월 1일 기준으로 해서 몇번째 날인지 알아내는 값
        sdf = new SimpleDateFormat("올해의 D번째 날");
        System.out.println(sdf.format(now));
        //format중에 d는 현재 월 기준으로 해서 몇번째 날인지 알아내는 값
        sdf = new SimpleDateFormat("이달의 d번째 날");
        System.out.println(sdf.format(now));

    }
}
