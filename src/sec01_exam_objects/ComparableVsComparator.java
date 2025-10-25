package sec01_exam_objects;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableVsComparator {

    static class Member implements Comparable<Member>{

        int score;
        String name;

        public Member(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public int compareTo(Member o) {
            System.out.println("CompareTo 호출");
            System.out.println(this.toString());
//            if (o.score < this.score) return -1;
//            else if (o.score == this.score) return 0;
//            else return 1;
//
            //내림 차순
//          return o.score - this.score;
            //오름차순
            return this.score - o.score;
        }

        @Override
        public String toString() {
            return this.score + " , " + this.name;
        }
    }

    static class NameAscending implements Comparator<Member>{
        Member m1 = null;
        Member m2 = null;


        @Override
        public int compare(Member o1, Member o2) {
            m1 = o1;
            m2 = o2;
            System.out.println("Comparator<Member>호출");
            return o1.name.compareTo(o2.name);
        }

        @Override
        public String toString() {
            String str1 = "m1값 :" + m1.score + ", " + m1.name;
            String str2 = "m2값 :" + m2.score + ", " + m2.name;
            return str1 + str2;
        }
    }

    public static void main(String[] args) {

        Member[] members = {
               new Member("abc" ,100),
                new Member("aaa" ,300),
                new Member("ccc" ,400),
                new Member("bbb" ,200),
        };

        //Arrays.sort() 메서드는 매개값으로 배열값이 기본형 타입이면, 기본적으로 오름차순
        // 정렬을한다. 매가값이 Comparable<T>인터페이스를 구현했다면, compar)

        Arrays.sort(members);
        System.out.println(Arrays.toString(members));


        Arrays.sort(members, new NameAscending());
        System.out.println(Arrays.toString(members));


    }
}
