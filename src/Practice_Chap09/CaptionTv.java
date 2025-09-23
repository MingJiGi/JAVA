package Practice_Chap09;
//자손 클래스(자식클래스, sub클래스) 멤버갯수 : 7개
//Tv , CaptionTv 직접적인 관계가 형성
public class CaptionTv extends Tv{

    boolean caption;

    //조상이 없는 자손은 없다.
    public CaptionTv(){
        super(); // 조상클래스의 기본생성자를 호출
        //내부적으로 컴파일러가 자동으로 super를 넣어준다.
    //    super(true, 10);
        System.out.println("자손클래스의 생성자 호출");
    }

    public CaptionTv(boolean caption){
    //    super(true,10);
        this.caption = caption;

    }
    public void displayCaption(String text){
        //1번째 호출에 false, 2번째 호칠시에는 true
        //캡션 상태가 on(true)일 때만 text를 보여준다.
        if(this.caption){
            System.out.println(text);
        }
    }
}
