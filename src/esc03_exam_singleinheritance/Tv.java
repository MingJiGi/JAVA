package esc03_exam_singleinheritance;

//조상클래스 멤버갯수 5개
public class Tv {

    boolean power; // 전원 상태
    int channel = 10; // 채널

    public Tv(){
        super();// object 생성자 호출
        System.out.println("Tv 조상클래스 생성자 호출");
    }
    public void power(){
        this.power = !this.power;
        System.out.println("조상클래스 Tv의 power메서드를 호출하였습니다.");
    }
    public void channelUp(){
        ++this.channel;
        System.out.println("조상클래스 Tv의 channelUp메서드를 호출하였습니다.");

    }

    public void channelDown() {
        --this.channel;
        System.out.println("조상클래스 Tv의 channelDown메서드를 호출하였습니다.");
    }
}
