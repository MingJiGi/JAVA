package sec_exam_method;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = new String("우민식");
        String strVar2 = "송수경";
        String strVar3 = "송수경";

        if (strVar1 == strVar2){
            System.out.println("같은 번지의 String 인스턴스 참조");
        }else {
            System.out.println("다른 번지의 String 인스턴스 참조");
        }

        if (strVar2 == strVar3){
            System.out.println("같은 번지의 String 인스턴스 참조");
        }else System.out.println("다른 번지의 String 인스턴스 참조");


    }
}
