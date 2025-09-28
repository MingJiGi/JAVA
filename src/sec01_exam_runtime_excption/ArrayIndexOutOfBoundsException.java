package sec01_exam_runtime_excption;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        try {

            String data1 = args[0];
            String data2 = args[1];
            System.out.println("args[0]" + data1);
            System.out.println("args[1]" + data1);

        } catch (Exception e) {

            //실행 매개값이 없ㅇ면 ArrayOutOfBoundsExcption발생
            System.out.println("실행방법");
            System.out.println("Java ArrayOutOfBoundsException");
            System.out.println("값1, 값2");
            e.printStackTrace();
        }
    }
}
