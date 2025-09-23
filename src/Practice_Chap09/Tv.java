package Practice_Chap09;

//조상클래스(부모, Super클래스) // 멤버갯수 : 5개
public class Tv extends Object{

    boolean power;
    int channel;

    public Tv(){
        System.out.println("조상클래스 생성자 호출");
    }
    public Tv(boolean power, int channel){
        super(); // object 클래스의 기본생성자를 호출
        this.power = power;
        this.channel = channel;
    }

    public void power(){
        this.power = power;

    }
    public void channelUp(){
        ++this.channel;
    }
    public void channelDown(){
        --this.channel;
    }
}
