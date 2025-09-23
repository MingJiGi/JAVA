package sec_verify02;

import java.util.Date;

public class Singleton {
    // 접근제어자 범위가 가장 좁은 범위의 제어자이기 때문에 외부에서 접근을 하지 못한다.
    private static Singleton singleton = new Singleton();

    //싱글톤 패턴은 그 핵심이 하나의 인스턴스를 공유하는 것이다. 하여 생성자에 private 를 통해
    // 외부에서 싱글톤 객체 생성을 막는다.
    private Singleton(){
        System.out.println("생성자 호출");
    }

    public Date getTime(){
        return new Date(); // 시각과 날짜
    }

    //getInstance() 하는 역할?
    // 공유 변수의 주소만 리턴해 주므로써 싱글톤 객체를 사용하게끔 해준다.
    public static Singleton getInstance(){
        return singleton;
    }




}
