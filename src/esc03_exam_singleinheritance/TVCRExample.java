package esc03_exam_singleinheritance;

public class TVCRExample {
    public static void main(String[] args) {
        //1. Tv 조상클래스 생성됨
        // 2. Vcr 생성됨
        // 3. TVCR자손클래스 생성됨
        TVCR tvcr = new TVCR();

        Tv tv = new Tv();
        tv.power();
        System.out.println();
        tvcr.power();

        System.out.println(tvcr.getChannel());

        tvcr.vcr.power();
        tvcr.play();
        tvcr.stop();
        tvcr.rew();
        tvcr.ff();
        tvcr.channelUp();
        System.out.println(tvcr.getChannel());

        tvcr.channelDown();
        System.out.println(tvcr.getChannel());

    }
}
