package sec01_exam_runtime_excption;

public class NullPointerException {
    public static void main(String[] args) {


        try {
            String data = null;
            System.out.println(data.toString());
            System.out.println("555555");

        }catch (Exception e){
            System.out.println("예외 발생");
            e.printStackTrace();
        }

    }
}
