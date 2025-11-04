package sec16_exam01_thread_group;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
    public static void main(String[] args) {

        AutoSaveThread autoSaveThread = new AutoSaveThread();
        //스레드 이름 지정(지정하지 않으면 Thread-n으로 표시된다.)
        autoSaveThread.setName("AutoSaveThread");

        //데몬 스레드는 주스레드 (Main) 에 종속적인 관계다 보니가
        // 주 스레드 종료되면 따라서 바로 종료
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        //Map 컬렉션 <키, 값> 키로 값을 찾아오는 알고리즘의 한 형태
     Map<Thread, StackTraceElement[]> map =  Thread.getAllStackTraces();

        //Map의 키 값을 set계열로 변환한다.
        Set<Thread> threads = map.keySet();

        for (Thread thread: threads){
            System.out.println("스레드 이름 : " + thread.getName()+
                    (thread.isDaemon() ? "데몬스레드" : "주스레드"));
            //스레드 그룹을 출력
            System.out.println("\t 소속 그룹 : " + thread.getThreadGroup().getName());
            System.out.println();
        }
    }
}
