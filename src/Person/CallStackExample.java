package Person;

public class CallStackExample {

    public static void main(String[] args) {
        System.out.println("main() 실행됨");
        CallStackExample.firstMethod();
        System.out.println("main () 종료됨");
    }
    //static은 static만 부를 수 있다.
    public static void firstMethod(){
        System.out.println("firstMethod() 실행됨");
        secondMethod();
        System.out.println("firstMethod() 종료됨");
    }
    public static void  secondMethod(){
        System.out.println("secondMethod() 실행됨");
        System.out.println("secondMethod() 종료됨");
    }
}
