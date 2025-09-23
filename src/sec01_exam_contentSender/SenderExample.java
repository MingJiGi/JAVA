package sec01_exam_contentSender;

public class SenderExample {

    public static void main(String[] args) {


        ContentSender cs1 = new letterSender("SMS문자","우민식","4달라");
        cs1.sendMsg("유재석");

        System.out.println();

        letterSender ls = new letterSender("SMS문자","김연아","3달라");
        ls.sendMsg("정준하");


        System.out.println();

        kakaoSender ks = new kakaoSender("카카오톡","이재훈","10달라");
        ks.sendMsg("아름다운 그녀");

//        ContentSender cs = new ContentSender() {
//        }
//
// 예외가 발생하는 이유는 추상클래스라서 인스턴스를 절대로 생성을 하지 못한다.



//        익명자손클래스
//        ContentSender cs = new ContentSender() {
//            @Override
//            public void sendMsg(String content) {
//                System.out.println(content + "\t익명자손클래스 ");
//            }
//        };
//        cs.sendMsg("안녕하세요");








    }
}
