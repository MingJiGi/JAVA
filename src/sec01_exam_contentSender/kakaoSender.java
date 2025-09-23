package sec01_exam_contentSender;

public class kakaoSender extends ContentSender{

    String content;


    public kakaoSender(String title, String nm, String content) {
        super(title, nm); // 조상클래스 호출
        this.content = content;
    }

    //조상클래스인 ContentSender 추상클래스의 추상메서드인 sendMsg()를
    // 오버라이딩(구현부 존재)함.
    @Override
    public void sendMsg(String recipient) {
        System.out.println("제목 = " + this.title);
        System.out.println("이름 = " + this.nm);
        System.out.println("내용 = " + this.content);
        System.out.println("받는사람 = " + recipient);

    }
}
