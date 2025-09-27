package sec07_exam_anonumousImplemants;

public class ActionExample {
    public static void main(String[] args) {

//        여기서 () 는 익명구현클래스의 생성자를 의미한다. 인터페이스는 생성자가 없다.
//                멤버변수의 초기값 대입된 형태

        Action action = new Action() {
//
//            익명구현클래스. 1회성  사용 용도로 거의 사용된다.
//                특히 UI이벤트 처리나 안드로이드 프로그래밍에 자주 등장한다.
//
                int a = 10;

                public void method(){
                    System.out.println("익명구현객체 자체 메서드, 멤버변수 a의 값" + a);
                }
            @Override
            public void work(int a) {
                this.method();
                System.out.println(a + "장을 복사 합니다.");
            }


        };

        action.work(100);
//        a와 method()는 Action 근본에 없다
//        action.method();

        Action action1 = (a) -> {
            System.out.println("람다식 :" + a + "카피를 합니다");};
        action1.work(100);




//        익명 자손 클래스

        Parent parent = new Parent(){

            public void cmethod(){
                System.out.println("자체 메서드인 cmthod 호출");
            }

            @Override
            public void pmethod() {
                int child = 10;
                this.cmethod();
                System.out.println("익명 자손클래스에서 오버라이딩된 pmethod 호출");;
            }
        };

        parent.pmethod();














    }
}
