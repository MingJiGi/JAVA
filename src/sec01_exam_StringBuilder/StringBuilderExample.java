package sec01_exam_StringBuilder;

public class StringBuilderExample {

    public static void main(String[] args) {


        //Buffer(임시 메모리 공간 - L1, L2 캐쉬, 램까지 확장)을 이용하기 때문에
        // 단일 인스턴스 모든 조작이 가능하다. 속도도 빠르다는 장점이 있다.
        StringBuilder sBuilder = new StringBuilder(20);
        System.out.println(sBuilder.hashCode());
        System.out.println(sBuilder.toString());
        System.out.println(sBuilder.capacity());

        sBuilder.append("자바프로그래밍");
        System.out.println(sBuilder.hashCode());
        System.out.println(sBuilder.toString());
        System.out.println(sBuilder.capacity());


        sBuilder.append("객체지향언어");
        System.out.println(sBuilder.hashCode());
        System.out.println(sBuilder.toString());
        System.out.println(sBuilder.capacity());
        System.out.println(sBuilder.length());

        sBuilder.insert(0,"이것이");
        System.out.println(sBuilder.hashCode());
        System.out.println(sBuilder.toString());
        System.out.println(sBuilder.length());


        sBuilder.replace(0,1,"Object");
        System.out.println(sBuilder.hashCode());
        System.out.println(sBuilder.toString());
        System.out.println(sBuilder.length());


        System.out.println(sBuilder.reverse());

        String str = new String(sBuilder);
        System.out.println(str);

        //역순 첫 번째 방법
        for (int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i));

             reverseString(str);
        }





    }
    public static String reverseString(String str){
        return (new StringBuilder((str)).reverse().toString());
    }
}
