package sec16_exam02_thread_group;

public class ThreadGroupExample {
    public static void main(String[] args) {
        //현재 실행중인 스레드 그룹명을 얻어낸다.
        String threadGroup1 = Thread.currentThread().getThreadGroup().getName();
        System.out.println(threadGroup1);

        //메인 그룹의 하위 그룹을 생성
        ThreadGroup myGroup = new ThreadGroup("MyGroup");
        WorkThread workThreadA = new WorkThread(myGroup,"workThreadA");
        WorkThread workThreadB = new WorkThread(myGroup,"workThreadB");
        WorkThread workThreadC = new WorkThread(myGroup,"workThreadC");
        WorkThread workThreadD = new WorkThread(myGroup,"workThreadD");

        workThreadA.start(); workThreadB.start();
        workThreadC.start(); workThreadD.start();

        ThreadGroup mainGroup1 = Thread.currentThread().getThreadGroup();
        //자신의 스레드 뿐만 아니라 하위그룹의 스레드 까지
        System.out.println("main 그룹의 실행중인 스레드 수 출력 : " + mainGroup1.activeCount());
        System.out.println("myGroup의 조상그룹명" + myGroup.getParent().getName());

        ThreadGroup parentGroup = Thread.currentThread().getThreadGroup().getParent();
        System.out.println("main의 조상그룹명 : "+ parentGroup.getName());

        System.out.println("[ 메인 스레드 그룹의 list()메서드 출력 결과 ]");
        mainGroup1.list();
        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            //myGroup에 포함된 workThreadA와 ,BCD 가 인터럽트 되어 종료됨.(스레드그룹을 쓰는 궁국적인 이유)
        }
        myGroup.interrupt();
    }
}
