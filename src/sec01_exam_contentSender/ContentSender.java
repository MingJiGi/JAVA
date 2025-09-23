package sec01_exam_contentSender;

public abstract class ContentSender {

    //추상클래스랑 ? 1개 이상의 추상메서드를 포함하는 클래스를 추상클래스
    //추상클래스는 인스턴스를 생성할 수 없다.


    //필드
    String title;
    String nm;

    public ContentSender(String title, String nm) {
        this.title = title;
        this.nm = nm;
    }

    public ContentSender() {
    }

    //추상메서드 --> 상속을 통해서 반드시 재정의(오버라이딩) 되어야지만
    //비로소 인스턴스를 생성할 수가 있다. (중요)
    public abstract void sendMsg(String content); //abstract 가 추상메서드 선언시 사용하는것



}
