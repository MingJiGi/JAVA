package sec04_thin_clone;

import java.util.Arrays;

// java.lang.Cloneable 인터페이스를 구현한 클래스만 clone()을 호출할 수 있다.
// 구현하지 아니하면 CloneNotSupportedException이 발생한다
public class Member implements Cloneable{
    String id,name,password;
    int age;
    boolean adult;
    int[] scores = null;

    public Member(boolean adult, int age, String id, String name, String password, int[] scores) {
        this.adult = adult;
        this.age = age;
        this.id = id;
        this.name = name;
        this.password = password;
        this.scores = scores;
    }

    // 얕은 복제한 인스턴스를 리턴
    public Member getMember(){
        Member cloned = null;
        try {
            cloned = (Member) this.clone(); // 여기서 clone()은 누구의 메서드인가?
            // Object에 있는 clone 메서드이다
        }catch (Exception e){
            e.printStackTrace();
        }
        return cloned;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Member{" +
                "adult=" + adult +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", scores=" + this.scores +
                '}';
    }
}

