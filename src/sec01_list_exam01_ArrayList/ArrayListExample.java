package sec01_list_exam01_ArrayList;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListExample {

    public static void main(String[] args) {

        //기본저긍로 방을 10개를 생성함
        ArrayList list = new ArrayList();
//        Vector v = new Vector();
//        System.out.println("총 크기 : " + v.capacity());
        //ArrayList 는 capacity()가 없다
        System.out.println("저장된 객체수 : " + list.size());
        list.add("111");
        list.add("222");
        list.add("333");
        list.add(333);
        list.add("444");
        System.out.println("저장된 객체수 : " + list.size());
        System.out.println("ArrayList 주소 : " + list.hashCode());
        System.out.println("ArrayList 에 있는 값 : " + list.toString());

        //0번째 인덱스에 새로 값을 넣으면 기존의 값들은 뒤로 밀려나게 된다
        list.add(0, "333");
        System.out.println("저장된 객체수 : " + list.size());
        System.out.println("ArrayList 주소 : " + list.hashCode());
        System.out.println("ArrayList 에 있는 값 : " + list.toString());

        list.remove("333");
        list.remove("333");
        System.out.println("ArrayList 에 있는 값 : " + list.toString());
        System.out.println("숫자 333이 있느냐 ?  : " + list.indexOf(333));


        //ArrayList의 각 인덱스의 값 삭제 remove(index)이용
//        for (int i = 0; i <list.size() ; i++) {
//            list.remove(i);
//        }
//        System.out.println("ArrayList 에 있는 값 : " + list.toString());
        /*
        다 삭제를 했음에도 불구하고 222, 444 이 남아 있다. 왜일까 ?
        0을 삭제할때는 i가 0이니 당연히 삭제가 된다. 하지만 0이 삭제된 후 뒤에 값들은
        다 앞으로 당겨져 올것이다. 그럼 다음 것을 삭제할려고 보니 i값은 1이다 하여 1을 삭제하지 않고
        2를 삭제하는 것이다. 그림으로 그려보면 잘 이해가 될 것이다.
        이해가 되었으면 ArrayList는 인덱스를 뒤에서부터 삭제를 해야 제대로 삭제가 됨을 알수가 있다.
         */

        //ArrayList For문 사용해서 제대로 삭제 시키는 방법
        //배열은 0부터 시작되기 때문에 아래와같이 size-1 해줘야 한다.
//        for (int i = list.size()-1; i >= 0; i--){
//            list.remove(i);
//        }
//        System.out.println("ArrayList 에 있는 값 : " + list.toString());
        list.clear();
        System.out.println(list.toString());
    }

}
