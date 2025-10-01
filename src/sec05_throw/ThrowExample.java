package sec05_throw;

public class ThrowExample {
    public static void main(String[] args){

        try {
            throw new Exception("고의로 발생");
//            결코 도달할수 없는 코드이므로 예외 발생
//            System.out.println("~~~~~~~~~~~~~~`");
        }catch (Exception e){
            System.out.println("예외 메세지 출력 : "+e.getMessage());
            e.printStackTrace();
        }
        //        System.out.println("정상 종료");
    }
}
