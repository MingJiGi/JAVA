package sec04_thin_clone;

import java.util.Arrays;

public class MemberExample {

    public static void main(String[] args) {


        Member original = new Member(true,25,"blue","홍길동",
                "12345",new int[]{90,100});

        Member cloned = original.getMember();
        cloned.age = 150;
        cloned.scores[0] = -777;
        System.out.println(original);
        System.out.println(cloned);


        //얕은 복제는 기본형 타입은 복제가 바로 되지만, 참조타입은 주소 공유가 이루어진다.
        System.out.println(Arrays.toString(original.scores));
        System.out.println(Arrays.toString(cloned.scores));





    }
}
