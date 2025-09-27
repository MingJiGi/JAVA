package sec06_exam_InterfaceExample_Indirect;

public class A {

    //클래스 B가 완성이 되지 않아도 선언부 즉 인터페이스에 있는 추성메서드인
    //선언부만 알고 있으면 언제든지 호출이 가능해진다.
    //이것이 간접적인 관계인 것이다.
    public void methodB(I i){
        i.methodB();
    }
}
