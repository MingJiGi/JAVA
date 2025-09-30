package sec03_Multi_Catch;

public class CatchOrderKindExample {
    public static void main(String[] args) {


        try {
            //AraayIndexOfBoundsexcption
            String data1 = args[0];
            String data2 = args[1];

            //NumberFormatexcption
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException 발생");
            System.out.println("실행매개값이 부족합니다.");
            System.out.println("실행방법 java CatchByExceptionKindExample num1 num2");
            System.out.println("프로그램을 정상종료합니다.");
        }catch (NumberFormatException e2){
            System.out.println("NumberFormatExcption");
            System.out.println("숫자로 변환할수 없습니다. 매개변수의 값을 확인하세요");
            System.out.println("프로그램을 정상종료합니다.");
        }
    }
}
