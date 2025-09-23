package Person;

public class Opp_09_02 {
    public static void main(String[] args){
        Data d = new Data(); // d 에는 레퍼런스 즉 주소값이 저장
        d.x = 10; // d 라는 객체안에 있는 x의 값에 10을 대입
        System.out.println("main() : x = " + d.x); // 해당코드는 10이 출력

        change(d); // change 메서드 실행시 Data d 의 주소값이 전달됨
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);

    }
    static void change(Data d){ // d에 10이 아닌 Data 타입의 d 를 매개변수로 받아 주소값이 들어옴
        d.x = 1000; // d.x 의 값을 1000으로 변경
        System.out.println("chage() : x = " + d.x);
    }
}
