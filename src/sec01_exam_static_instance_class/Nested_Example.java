package sec01_exam_static_instance_class;

public class Nested_Example {




    //인스턴스 멤버 클래스
    class  InstanceClass{

        int iv = 100;
        static int cv = 500; // 원래는 에러가 나는것이 맞으나 자바 16버전 부터 허용됨
        static final int CONST = 10000; // 인스턴스와 무관함, 하여 멤버로 사용 가능

        //생성자
        public InstanceClass() {
            System.out.println("InstanceClass 생성자 호출 ");
        }

        //인스턴스 메서드
        public void instanceMethod(){
            System.out.println("InstanceClass 인스턴스메서드 호출 ");
        }
        //정적 메서드
        public static void staticMethod(){
            System.out.println("InstanceClass 정적메서드 호출 ");
        }


    }
    //정적 멤버 클래스
    static class  staticClass{

        static  int cv = 300;
        int iv = 15;


        //생성자
        public staticClass() {
            System.out.println("staticClass 생성자 호출");
        }

        //인스턴스 메서드
        public void instanceMethod(){
            System.out.println("staticClass 인스턴스메서드 호출 ");
        }
        //정적 메서드
        public static void staticMethod(){
            System.out.println("staticClass 정적메서드 호출 ");
        }
        //정적멤버클래스라고 해도 인스턴스 필드를 가질 수 있다.
        //정적클래스도 생성자가 존재하므로 인스턴스를 생성할 수 있으므로
        //인스턴스나 필드나 메서드가 존재할수 있다.

    }

    public void method(){
        // 로컬 클래스 사용범위는 method(){ 범위 }
        class LocalClass{
            int iv = 300;
            static int cv = 500; // 이것도 원래는 static 선언 안됨
            static final int LOCAL = 1000;

            public LocalClass() {
                System.out.println("LocalClass 생성자 호출");
            }
            public void method(){
                System.out.println("LocalClass 메서드 호출, iv : " + this.iv);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.method();


    }


    public static void main(String[] args) {

        //외부클래스 생성
        Nested_Example nestedExample = new Nested_Example();
        //인스턴스 멤버클래스 생성
        Nested_Example.InstanceClass ic = nestedExample.new InstanceClass();
        System.out.println(ic.iv);
        ic.instanceMethod();

        //정적 클래스 접근
        Nested_Example.staticClass sc = new staticClass();
        System.out.println(staticClass.cv);
        System.out.println(sc.iv);
        sc.instanceMethod();
        Nested_Example.staticClass.staticMethod();


        //로컬클래스 접근

        nestedExample.method();



    }

}
