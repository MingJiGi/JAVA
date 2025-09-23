package sec_verify02;

public class KoreanExample {
    public static void main(String[] args) {

        Korean kr = new Korean("대한민국","홍길동",177,26,"똑똑함");
        System.out.println("첫 번째 공개 수배자입니다."+kr);

        Korean kr1 = new Korean("프랑스", "아르센 뤼펭", 177,50, "안경");
        System.out.println("두 번째 공개 수배자입니다." + kr1);
    }
}
