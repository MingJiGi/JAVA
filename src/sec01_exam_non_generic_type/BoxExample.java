package sec01_exam_non_generic_type;

public class BoxExample {

    public static void main(String[] args) {

        Box box = new Box();
        box.setObject("홍길동"); // 업케스팅( 형변환 생략가능)
        String name = (String) box.getObject();
        System.out.println(name);

        box.setObject(new Apple());
        Apple apple = (Apple) box.getObject();
        System.out.println(apple);
    }
}
