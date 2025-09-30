package sec06_throws;

public class ThrowsExample01 {
    public static void main(String[] args) throws Exception{
//        이렇게 main() 다른 메서드인 method1() 을 호출했을때, 예외를 떠넘기기를
//                하고 있기 때문에 main() 에 예외처리코드가 들어가야 한다.
//        1. main () -> throws Exception 붙인다.
//        2. main() 자체에서 try / catch 구문으로 직접 예외를 처리한다.


        methid1();
    }

    public static  void methid1() throws Exception {
        method2();
    }

    private static void method2() throws Exception {
        throw new Exception("예외 발생함");
    }

}
