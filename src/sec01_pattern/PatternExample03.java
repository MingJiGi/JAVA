package sec01_pattern;

import java.util.regex.Pattern;

public class PatternExample03 {

    public static void main(String[] args) {

        //010 으로 시작하는 전화번호 패턴 정의
        String regExp = "(010)\\d{3,4}\\d{4}";
        String data = "01099032723";


        //Partten 클랫의 matches() 정적메서드로 정규표현식과 입력한 문자열의 패턴이
        // 일치하는지 검증해서 boolean타입으로 리턴한다.
        boolean result =  Pattern.matches(regExp,data);
        if (result) System.out.println("전화번호 양식이 맞습니다.");
        else System.out.println("다시 입력하세요.");



        //이메일 패턴 정의
        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "lab@naver.co.kr";


        result =  Pattern.matches(regExp,data);
        if (result) System.out.println("email 양식이 맞습니다.");
        else System.out.println("email 을 다시 입력하세요.");

    }
}
