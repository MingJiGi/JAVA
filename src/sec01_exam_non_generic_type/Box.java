package sec01_exam_non_generic_type;

public class Box {

    private Object object;

    //리턴타입이나 매개변수가 Object라는 것은 모든 클래스를 매개변수로
    // 받겟다는 의미(다형성)
    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

}
