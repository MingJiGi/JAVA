package sec05_deep_clone;

import java.util.Arrays;

// java.lang.Cloneable 인터페이스를 구현한 클래스만 clone()을 호출할 수 있다.
// 구현하지 아니하면 CloneNotSupportedException이 발생한다
public class Member implements Cloneable{
    String name;
    int age;
    int[] scores = null;
    Car car = null;

    public Member(int age, Car car, String name, int[] scores) {
        this.age = age;
        this.car = car;
        this.name = name;
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
        // super 로 clone을 불러오는 이유 ?
        // 먼저 얕은 복제(object의 clone()메서드를 먼저 호출) - 기본형 타입을 복제
        Member cloned = (Member) super.clone();

        //참조타입의 경우는 반드시 프로그래머가 복제되는 코드를 삽입을 해줘야 한다.
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
        cloned.car = new Car(this.car.model);




        return cloned;
    }

    @Override
    public String toString() {
        return "Member{" +
                "age=" + this.age +
                ", name='" + this.name + '\'' +
                ", scores=" + this.scores +
                ", car=" + this.car +
                '}';
    }
}

