package sec02_exam_Instanceof;


class Parent { }

class Child extends Parent{}

public class InstanceofExmaple2{
    public static void main(String[] args) {
        Parent parentA = new Child();

        method(parentA);
        method(new Child());
        method(parentA);

        Parent parentB = new Parent();
        method(parentB);
        method(new Child());
        method(parentB);
    }

    public static void method(Parent parent){
        if(parent instanceof Child){
            //서로 상속 관계에 있어서 instanceof 연산자의 결과가 앞으로 true이므로
            // 강제캐스팅이 가능.
            System.out.println("method - Child 로 변환 성공");
        }else {
            System.out.println("method1 - Child로 변환 실패");
        }
    }

//    public static void method2(Parent parent){
//        if (parent instanceof Child){
//            //형변환이 가능하냐? 물어볼때 사용하는 연산자가 바로 instanceof 메서드
//            Child child = (Child)parent;
//            System.out.println("method2 - Child로 변환 성공");
//        }else {
//            System.out.println("method2 - Child로 변환 실패");
//        }
//    }

}


