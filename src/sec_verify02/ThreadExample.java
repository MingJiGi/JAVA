package sec_verify02;

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new YourThread());

        t2.start();
        t1.start();

    }
}
