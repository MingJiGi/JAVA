package sec01_exam_String_constructor;

import java.util.Arrays;
import java.util.Scanner;

public class ByteToExample {

    public static void main(String[] args) {
        //10개의 키코드(문자코드)값이 저장되어 있는 byte배열
        byte[] bytes = new byte[] {72,101,108,108,111,32,74,97,118,97};
        System.out.println("bytes 배열의 길이" + bytes.length);

        String str = new String(bytes);
        System.out.println("디코딩된 문자열" + str);

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 : ");
        String str1 = scanner.nextLine();
        //인코딩하는 과정
        byte[] bytes1 = str1.getBytes();
        System.out.println("인코딩한 결과" + Arrays.toString(bytes1));

        scanner.close();

    }
}
