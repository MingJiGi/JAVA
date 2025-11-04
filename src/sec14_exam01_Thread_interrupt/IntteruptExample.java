package sec14_exam01_Thread_interrupt;

public class IntteruptExample {
    public static void main(String[] args) throws Exception{
        PrintThread printThread = new PrintThread();
        printThread.start();

        Thread.sleep(1000);

        printThread.interrupt();
    }
}
