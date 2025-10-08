package sec_exam_method;

public class StringLengthExample {
    public static void main(String[] args) {

        //대소문자와 특수문자
        String ssn = "1234567891111";
        System.out.println(ssn.length());


        int legth = ssn.length();


        if (legth == 13){
            System.out.println("주민번호 자리가 맞습니다.");
        }else System.out.println("주민번호 자릿수가 틀렷습니다");









    }
}
