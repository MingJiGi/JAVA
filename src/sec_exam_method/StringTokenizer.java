package sec_exam_method;

public class StringTokenizer {
    public static void main(String[] args) {

        String data ="100             200  300";


        //아래 둘다 구분자를 공백으로 주었다
        // String split메서드는 공백까지 하나의 토큰으로
        // 인식을 한다.

        String[] result = data.split(" ");
        java.util.StringTokenizer st = new java.util.StringTokenizer(data, " ");

        for (String str : result) System.out.println(str);
        System.out.println("Token개수 :  " + result.length);

        System.out.println("-----------------------------------------");
        //StringTokenizer클래스의 hasMoreTokens() 와 nextTokens() 는
        // Token을 가져와서 출력하고 그 개수를 삭제를 한다.)
        System.out.println("Token개수 : " + st.countTokens());
        while (st.hasMoreTokens()){
            System.out.println("Token개수 : " + st.countTokens());
            String str = st.nextToken();
            System.out.println(str);
        }
    }
}
