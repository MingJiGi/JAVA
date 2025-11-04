package sec01_list_exam02_Vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<Board> list = new Vector<>();
        System.out.println(list.capacity());

        //객체 추가
        list.add(new Board("제목1","내용1","글쓴이1"));
        list.add(new Board("제목2","내용2","글쓴이2"));
        list.add(new Board("제목3","내용3","글쓴이3"));
        list.add(new Board("제목4","내용4","글쓴이4"));
        list.add(new Board("제목5","내용5","글쓴이5"));
        System.out.println(list.size());

        list.remove(2);
        list.remove(3);
        list.ensureCapacity(20);//용량만 확보
        System.out.println(list.capacity());

//        list.setSize(list.size()*2);
        System.out.println(list.size());
        System.out.println(list.toString());
        System.out.println(list.capacity());

        //trimToSize() 확보된 공간을 삭제한다.
        list.trimToSize();
        System.out.println(list.size());
        System.out.println(list.toString());
        System.out.println(list.capacity());

        //리스트 계열은 향상된 for문으로 출력하는 것 일반적이다.
        for (Board board : list){
            System.out.println(board.subject+"\t" + board.content+"\t" + board.writer);
        }
        //리스트 계열에도 어차피 Collection 인터페이스를 상속받았기 때문에 반복자 (iterator)를 사용할수가 있다.
        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()){
            Board board = iterator.next();
            System.out.println(board.subject+"\t" + board.content+"\t" + board.writer);
        }

    }
}
