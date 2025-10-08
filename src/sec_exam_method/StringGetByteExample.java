package sec_exam_method;

import java.io.UnsupportedEncodingException;

public class StringGetByteExample {
    public static void main(String[] args) {

        String str = "Hello World MingJiGi`s";

        //인코딩(기게가 알아보기 쉽게 변환하는 과정)
        byte[] bytes = null;
        try {
            bytes = str.getBytes("UTF-8");
            System.out.println("Bytes의 길이 : " +bytes.length);
            //디코딩(인간이 알아보기 쉽게 변환하는 과정)
            //문자열들이 깨져보이는 현상을 송, 수신이나 파일을 읽거나 쓸때
            // 문자셋 설정이 서로 맞지 않아서 생기는 현상이니, 왠만하면 UTF-8
            // 로 통일을 해주는 것이 문제가 발생되지 않을 것이다.
            String str1 = new String(bytes, "UTF-8");
            System.out.println("바이트 배열 -> 문자열 : " + str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
