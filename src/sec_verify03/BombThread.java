package sec_verify03;

public class BombThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 9; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i == 5){
                throw new Bom("펑");
            }
        }
    }
}
