package sec01_exam_String_constructor;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class KeyboardToString {
    public static void main(String[] args) {

        String str = "자바프로그래밍";
        try {
            String is1 =  URLEncoder.encode(str, "UTF-8");
            System.out.println(is1);

            String ds1 =  URLDecoder.decode(is1, "UTF-8");
            System.out.println(ds1);


            String is2 =  URLEncoder.encode(str, "EUC-KR");
            System.out.println(is2);

            String ds2 =  URLDecoder.decode(is2, "MS949");
            System.out.println(ds2);


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


//        byte[] bytes = new byte[100];
//        System.out.print("입력 : ");
//        int readCount = 0;
//
//        try {
//            readCount = System.in.read(bytes);
//            String str = new String(bytes,0,readCount,"UTF-8");
//            byte[] b = str.getBytes("UTF-8");
//            System.out.println("b의 길이 : " + b.length);
//            System.out.println("String값 : " + str);
//            System.out.println("byte[]의 값 : "+ Arrays.toString(b));
//            System.out.println("입력받은 바이트 수 : " + readCount);
//
//
//            byte[] b2 = "칼라".getBytes("UTF-8");
//            System.out.println("칼라 길이 : " + b2.length);
//            String str1 = new String("칼라");
//            byte[] b3 = str1.getBytes("EUC-KR");
//            System.out.println(b3.length);
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}

