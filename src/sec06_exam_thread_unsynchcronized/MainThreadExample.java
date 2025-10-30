package sec06_exam_thread_unsynchcronized;

public class MainThreadExample {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        //문제가 무엇인가? 출력결과를 보면, User2가 변경한 값으로 다 출력된다.
        // 과연 User1스레드는 원하는 결과값인가?
        // 이 문제는 이제 어떻게 해결하는 방법은? --> 동기화를 해줘야 한다.
        // 이제 문제가 해결되었다. 단순히 문제가 되는 메서드 앞에
        // synchronized제어자를 붙여줌으로써 객체 잠금(메서드 잠금)이 일어나
        // 데이터의 정확성을 지켜준다.)


        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();

        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();

    }
}
