package sec01_exam_create_singleThread;

import java.awt.*;

public class BeepPrintExample {

    public static void main(String[] args) {
        /*
            아래 코드는 싱글스레드에서 돌아가는 작업이므로, 비프음을 5번 알리고 난 후,
            "띵" 이라는 문자열을 5번 출력된다. 하지만, 우리가 원하는 것은 "띵" 이라는
            문자열이 출력되면서 비프음도 같이 출력되는 것을 원한다.
            이것이 바로 싱글 스레드의 단점이다. 순차적 이라는 것이다.
            이것을 멀티스레드로 바꿔가는 것이 스레드 장에서 우리가 해야 할 일이다.
            Toolkit은 AWT(Abstract Window Toolkit) 추상클래스를 상속받은 또다른 추상클래스이다.
            그중 GUI관련된 메서드들이 있다. getDefaultToolkit()은 기본적인 메서드를 구현해 놓은 메서드이다.
         */
        System.out.println(Thread.currentThread().getName()); // 현재 실행중인 스레드 이름을 출력
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
            toolkit.beep();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
