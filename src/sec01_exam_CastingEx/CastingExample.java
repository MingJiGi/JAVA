package sec01_exam_CastingEx;

public class CastingExample {
    public static void main(String[] args) {

        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();

        //UpCasting
        // 자손타입 -> 조상타입 (형변환 생략가능)
        car = fe; // car = (Car)fe; 에서 형변환이 생략된 형태(필드의 다형성)
//        car.water(); 컴파일 예외가 발생, 이유는 ? car의 근본은 car 이기 때문이다.

        //DownCasting (형변환 생략이 불가능하다)
        fe2 = (FireEngine) car; // 자손타입 <- 조상타입
        fe2.water(); // fe2의 근본은 FireEngine 이기 때문에 water 호출 가능


    }
}
