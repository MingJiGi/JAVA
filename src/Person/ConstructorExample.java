package Person;

public class ConstructorExample {
    public static void main(String[] args) {

        Data1 d1 = new Data1(); // 생성자 호출 (기본)
        Data2 d2 = new Data2(); // 컴파일 예외 발생 Data2 에는 매개변수가 있는 생성자가 있음으로 생성자가 자동 할당이 안됨.

        d1.value = 10;
        System.out.println(d1.value);

        System.out.println(d2.value);

        Data2 d3 = new Data2(15); // 매개 변수가 있는 생성자를 호출
        System.out.println(d3.value);


    }
}
