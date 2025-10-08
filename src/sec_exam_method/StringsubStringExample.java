package sec_exam_method;

public class StringsubStringExample {
    public static void main(String[] args) {

        //subString메서드는 문자열 잘라내는 메서드
        String ssn = "990915-1234567";

        //subString메서드는 아래와 같이 오버로딩이 되어 있다.
        // 두번째 오버로딩된 메서드는 처음 인덱스는 포함하나,
        // 마지막 인덱스는 포함하지 않는다
        System.out.println(ssn.substring(7));
        System.out.println(ssn.substring(0,6));












    }
}
