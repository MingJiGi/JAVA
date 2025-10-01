package sec01_equals;

import java.util.Objects;

public class Member {

    String id;

    public Member(String id) {
        this.id = id;
    }


    //매개변수로 Object가 있다 이 뜻은 모든 클래스의 최고조상인 Object 클래스이기 때문에
    // object를 상속받는 모든 클래스는 해당 매개변수로 들어올수 있다.
    @Override
    public boolean equals(Object o) {
        System.out.println("equals 호출");


        if (o instanceof Member){
            Member member = (Member) o;
            if (this.id == member.id){
                return true;
            }
        }


        return false;

    }


}
