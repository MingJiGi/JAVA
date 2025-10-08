package sec_exam_method;

public class StringValueOfExmaple {
    public static void main(String[] args) {

        //String.valueOf() 정적메서드로써 UI화면에서 진행율이나
        // 수치값을 나타내고자 하는 경우 많이 사용한다.
        String st1 = String.valueOf(true);
        String st2 = String.valueOf(10);
        String st3 = String.valueOf(10.5);

        //st1값은 참, 거짓을 나타내는 boolean 타입이 아니라
        //String 타입이다 라는것에 주목
        System.out.println(st1);
        System.out.println(st2.equals(st3));
        System.out.println(st3);
    }
}
