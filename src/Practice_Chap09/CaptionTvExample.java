package Practice_Chap09;

public class CaptionTvExample {
    public static void main(String[] args) {

        Tv tv = new Tv();
        CaptionTv captionTv = new CaptionTv(); // 기본생성자 호출
        //둘의 차이점 ?
        //다룰수있는 멤버변수의 갯수가 차이가 난다
        // Tv는 5개 CaptionTv는 7개


        captionTv.channelUp();
        System.out.println("현재 채널 : " + captionTv.channel);

        //displayCation()을 호출햇는데 안돼는 이유는 boolean 이 디폴트가 false라서
        captionTv.displayCaption("캡션기능 출력 메세지 : Hellow");

        captionTv.caption = true; // 캡션기능을 킨다.
        captionTv.displayCaption("캡션기능 출력 메세지 : Hellow");


    }
}
