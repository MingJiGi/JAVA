package sec02_exam_Nested_Class;

public class A {

    public A() {
        System.out.println("A객체가 생성됨.");
        B b = new B();// 이게 가능한 이유 ?
        b.a = 20;
    }

    //인스턴스 멤버클래스인 B
    class B{
        int a = 10;

        public B() {
            System.out.println("B객체가 생성됨.");
        }

        void method1(){
            System.out.println("B클래스의 멤버메서드 method1이 호출됨");
        }
        void method2(){
            this.method1();
            System.out.println("B클래스의 멤버메서드 method2이 호출됨");
        }
    }
    //정적멤버클래스인 C
    static class C{
        public C(){
        System.out.println("static C객체가 생성됨");
        }
        int b = 10;
        static int c = 20;

        void method2(){
            System.out.println("static C클래스의 멤버메서드 method2이 호출됨");
        }
        static void method3(){
            System.out.println("static C클래스의 static멤버메서드 method3이 호출됨");
        }
    }
    //로컬클래스
    class D{
        public D(){
            System.out.println("D객체가 생성됨.");
        }
        int e = 30;
        //static int f = 30;
        void localmethod(){
            System.out.println("로컬클래스인 D클래스이 멤버메서드 method이 호출됨");
            System.out.println(e);
        D d = new D();
        d.e = 50;
        d.localmethod();
        }
    }

    public static void main(String[] args) {
        A a = new A();// 외부 클래스 인스턴스 생성
        //A클래스의 멤버변수격인 내부 클래스 인스턴스 생성
        //필히 외부클래스 인스턴스가 존재하여야 한다
        A.B b = a.new B();
        b.method1();
        b.method2();

        A.C c= new C();
        c.method2();
        A.C.method3();





//        a.D = a.new D();

    }

}


