package sec01_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        //Date라는 클래스는 TimeStamP 기능으로 많이 사용된다.
        Date date = new Date();

        //Date 클래스의 참조변수 출력하면 세계표준협정시(UTC) 형태로 출력이 됨.
        System.out.println(date.toInstant());

        SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일 a HH:mm:ss");
        System.out.println(sdf.format(date));

    }
}
