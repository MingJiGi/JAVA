package sec_verify02;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
