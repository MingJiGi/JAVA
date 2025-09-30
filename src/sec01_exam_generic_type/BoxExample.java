package sec01_exam_generic_type;

public class BoxExample {
    public static void main(String[] args) {


        //(아래 코드에서 Box<T>dptj T는 String이다, 즉 Box클래스는 제네릭 타입의
        // 클래스이며 무조건 값을 String으로만 지정해야한다. (컴파일러에게 알린다.)
        // 타입변환을 제거하면서 아울러 현업에서는 데이터의 표준화를 만들수 있다.)



        Box<String> box1 = new Box<String>();
        box1.setT("홍길동");
        String str =  box1.getT();
        System.out.println(str);


        Box<Integer> box2 = new Box<>();
        box2.setT(10);
        int a =  box2.getT();
        System.out.println(a);


        Box<Apple> apple = new Box<>();
        apple.setT(new Apple());
        Apple x = apple.getT();
        System.out.println(x);

















    }
}
