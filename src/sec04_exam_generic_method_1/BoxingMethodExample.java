package sec04_exam_generic_method_1;

public class BoxingMethodExample {
    public static void main(String[] args) {

        //Util 클래스의 boxing()메서드는 정적메서드이면서, 아울러 제네릭 메서드이다.
        // 하여, 아래와 같이 타입을 지정해줘야 한다. 그렇게 되면 정해진 타입에 의해서
        // <T>가 결정된다)

        //정석코드
//        Box<Integer> box = Util.<Integer>boxing(100);
        // 컴파일러가 알아서 유추한다.
        Box<Integer> box = Util.boxing(100);
        int value = box.getT(); // 자동언박싱
        System.out.println(value);

        Box<String> box1 = Util.boxing("홍길동");
        String name = box1.getT();
        System.out.println(name);









    }
}
