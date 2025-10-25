package sec_verify03;

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberThread());
        Thread t2 = new Thread(new BombThread());
        t1.setName("t1");
        t2.setName("t2");
        t2.start();
        t1.start();
    }
}
