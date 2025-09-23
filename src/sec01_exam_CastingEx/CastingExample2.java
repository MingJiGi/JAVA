package sec01_exam_CastingEx;

public class CastingExample2 {
    public static void main(String[] args) {
//        Car car = new FireEngine();
        //Car car = new Car();
        Car car = new Aubulance();


        Car car2 = null;
        FireEngine fe = new FireEngine();
        Aubulance al = null;
        car.drive();
        fe.drive();
        fe.water();

        // 형변환은 상속관계에서만 성립한다.
//        fe = (Aubulance) al;

//        car = fe;
        //컴파일은 ok, 실행시 에러가 발생(ClassCastException 발생)
        fe = (FireEngine) car;


        car2 = fe;
        car2.drive();



    }
}
