package sec02_try_cathc_finally;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
//    Class클래스는 문자열을 가지고 클래스로 만들어서 반환해준다.
//        (인스턴스를 사용할 수 있지만. 반환된 인스턴스의 정보만 알 뿐이다.)
//        하지만. 문자열에 해당하는 클래스가 없다면 일반 예외가 발생한다.
//                그래서 컴파일 되지 않는다 즉 다시말해 예외처리가 필수적이다.
        try {
            Class classzz = Class.forName("java.lang.String2");
            System.out.println("클래스를 찾았습니다");
            System.out.println(classzz.getName());
            System.out.println(classzz.getSimpleName());
            //            str.value;
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage() );
        }
        finally {
            System.out.println("프로그램을 안전하게 종료 하엿습니다.");
        }
    }
}
