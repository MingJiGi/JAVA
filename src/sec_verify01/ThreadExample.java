package sec_verify01;

public class ThreadExample {
    public static void main(String[] args) {

        Thread t1 = new MovieThread();
        Thread t2 = new Thread(new RecordingRunnable());

        t1.start();
        t2.start();

    }
}
