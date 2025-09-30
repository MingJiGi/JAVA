package sec04_exam_generic_method_1;

public class Util {


    //새로운 box 객체를 생성해서 주소값을 리턴해주는 역할을 하는 메서드
    public static <T> Box<T> boxing(T t){

        Box<T> box = new Box<>();
        box.setT(t);
        return box;


    }














}
