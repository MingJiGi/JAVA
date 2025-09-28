package sec02_try_cathc_finally;

public class TryCatchExample01 {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);

        System.out.println(3);
        System.out.println(-10);
        System.out.println(5);

        try {
            System.out.println(1/0);

        }catch (Exception a){
            System.out.println("0으로 나눌수 없습니다");
        }finally {
            System.out.println(6);
        }

    }
}
