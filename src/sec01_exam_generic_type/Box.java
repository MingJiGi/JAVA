package sec01_exam_generic_type;


//Box클래스를 제네릭타입으로 설계함.
public class Box <T>{
    //설계과정이고 개발시에 T가 실질적으로 결정된다.
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
