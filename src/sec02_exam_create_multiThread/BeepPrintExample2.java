package sec02_exam_create_multiThread;

import java.awt.*;

public class BeepPrintExample2 {
    public static void main(String[] args) {
//
//        //직접 생성하는 멀티스레드로 하는 3가지 방법
//        //방법 1--> 직접 생성
//        Runnable beepTask = new BeepTask(); // 인터페이스 필드의 다형성
//        Thread thread = new Thread(beepTask);
//
//        thread.start();
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("for 문을 실행하는 스레드 이름 :" + Thread.currentThread().getName());
//            System.out.println("띵");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
////        thread.start(); 재사용 불가능
//        //스레드는 재사용이 안된다. 재사용을 하려면 아래와 같이 인스턴스를 다시 생성해야 한다.
//        beepTask = new BeepTask(); // 인터페이스 필드의 다형성
//        thread = new Thread(beepTask);
//        thread.start();


        //방법2 --> 익명 구현 클래스 이용
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Toolkit toolkit = Toolkit.getDefaultToolkit();
//                for (int i = 0; i <5 ; i++) {
//                    System.out.println("for문을 실행하는 스레드 이름 : " + Thread.currentThread().getName());
//                    System.out.println("beep");
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });

//        thread.start();

//        for (int i = 0; i < 5; i++) {
//            System.out.println("for 문을 실행하는 스레드 이름 :" + Thread.currentThread().getName());
//            System.out.println("띵");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }


        //방법3 --> 람다식(함수적 인터페이스) 이용하여 초간단화 () 는 run메서드의 매개변수를
        // 의미하는데 매개변수가 1개도 없다는 의미이다. {}는 run() 실행 블럭을 의미함.
        // 람다식은 1.8부터 등장

//        Thread thread = new Thread(() -> {
//            Toolkit toolkit = Toolkit.getDefaultToolkit();
//                for (int i = 0; i <5 ; i++) {
//                    System.out.println("for문을 실행하는 스레드 이름 : " + Thread.currentThread().getName());
//                    System.out.println("beep");
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//        });

//        thread.start();


        //방법4 --> 직접 Runnable 익명구현객체를 만들어서 Thread의 매개값으로 대입
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    System.out.println("for문을 실행하는 스레드 이름 : " + Thread.currentThread().getName());
                    System.out.println("beep");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();



        for (int i = 0; i < 5; i++) {
            System.out.println("for 문을 실행하는 스레드 이름 :" + Thread.currentThread().getName());
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
}
