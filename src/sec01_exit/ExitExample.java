package sec01_exit;

public class ExitExample {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                //어떤 값이라도 들어가면 JVM에게 프로그램 종료 요청함
                System.exit(i);
            }catch (SecurityException e){
                System.out.println(e.getMessage());
            }
        }











    }
}
