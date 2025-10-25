package sec01_pattern;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExampl01 {
    public static void main(String[] args) {

        String[] data = {
               "bat","baby","bouns","cA","ca","co","c","c0","car",
                "cobat","count","date","disc"
        };

        Vector<String> vector = new Vector<>();
        //아래 패턴을 정의를 하였는데, c도 포함하고 c로 시작하는 소문자나 영어단어나 문장을 패턴으로 설정
        Pattern pattern = Pattern.compile("c[a-z]*");
        System.out.println("c로 시작하는 알파벳이나 단어, 문장을 출력합니다.");
        for (String str : data){
           Matcher matcher = pattern.matcher(str);
           if (matcher.matches()) System.out.println(str);
           vector.add(str);
        }

        
    }
}