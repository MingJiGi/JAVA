package sec01_exam_runtime_excption;

public class NumberFormatExcptionExample {

    public static void main(String[] args) {

        String data1 = "100";
        String data2 = "100ㅁ";

        int value1 = Integer.parseInt(data1);
        System.out.println(value1);
//
//        int value2 = Integer.parseInt(data2);
//        System.out.println(value2);

    try {
        int value2 = Integer.parseInt(data2);
        System.out.println(value2);
    }catch (Exception a){
        System.out.println("예외 발생");
        a.printStackTrace();
    }


    }

}
