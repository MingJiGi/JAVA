package sec_exam_method;

public class StringIndexOfExample {
    public static void main(String[] args) {

        //indexOf메서드는 찾기 기능을 할 때, 자주 쓰인다
        String str = "우민식";
        int index = str.indexOf("식");

        System.out.println("식 의 위치 : " + index);


        // 식 이라는 문자열이 포함되어 있으면
        if (str.indexOf("식") != -1) System.out.println("식이 포함되어 있습니다.");
        else System.out.println("식이 포함되어 있지 않습니다 .");







    }
}
