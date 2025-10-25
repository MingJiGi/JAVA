package sec03_exam_threadExtends_01;


import java.awt.*;

//Runnable 인터페이스를 직접 구현하고 있다.
public class BeepThread extends Thread{


    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i <5 ; i++) {
            System.out.println("for문을 실행하는 스레드 이름 : " + Thread.currentThread().getName());
            System.out.println("beep");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
