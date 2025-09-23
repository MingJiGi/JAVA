package esc03_exam_singleinheritance;

public class TVCR extends Tv{

    // 포함관계
    Vcr vcr = new Vcr();
    public TVCR(){
        super(); // Tv클래스를 호출
        System.out.println("TVCR클래스 생성자 호출");
    }
    //this는 객체자신을 가리킨다. super는 조상크래스의 멤버를 지칭할 때 쓴다.
    public int getChannel(){
        return this.channel; // channel 은 조상의 멤버변수지만 상속을 받앗으니 사용가능
    }
    public void play(){
        vcr.play();
    }
    public void stop(){
        vcr.stop();
    }
    public void rew(){
        vcr.rew();
    }
    public void ff(){
        vcr.ff();
    }

    //조상메서드를 재정의(오버라이딩), 선언부 항상 같아야한다.
    //상속관계에서 오버라이딩이 이루어져야 한다.
    @Override
    public void power() {
        this.power = !power;
        System.out.println("자손클래스 TVCR의 power메서드를 호출하였습니다.");
        super.power(); // 조상클래스의 Tv의 power()를 명시적으로 호출한 것이다.
    }
}
