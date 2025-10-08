package sec_exam_method;

public class StringTrimExample {
    public static void main(String[] args) {

        //String의 trim()은 문자열을 기준으로 해서 좌, 우 공백만 없앤다.
        // 하여, 문자열 중간에 있는 공백은 프로그래머가 직접 찾아서
        // 없애주는 코드를 만들어야 한다
        // 아이디나 패스워드 입력받을 경우 trim()을 활용하면, 오류를
        // 많이 줄일수 있다 .)

        String tel1 = "               063";
        String tel2 = "-611             ";
        String tel3 ="10           38     ";


        System.out.println(tel1.trim() + tel2.trim()
                + tel3.trim());
    }
}
