package sec07_exam_sychronized;


public class MainThreadExample {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(); // 공유 객체 생성

        //syncronized 제어자를 붙여줌으로써 객체 잠금이 일어나 데이터의 정확성을 지켜준다
        User1 user1 = new User1();
        user1.setCalculator(calculator);

        User2 user2 = new User2();
        user2.setCalculator(calculator);


        user1.start();
        user2.start();

    }
}
