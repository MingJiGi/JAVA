package sec01_exam_objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {

    static class Student{
        // 중첩클래스(정적멤버클래스)
        int sno;
        String name;

        public Student(String name, int sno) {
            this.name = name;
            this.sno = sno;
        }

    }
    //Comparator<T> 비교자 인터페이스를 구현하고 있는 studentComparator 클래스
    static class StudentComparator implements Comparator<Student>{
        // sno 를 가지고 두 객체를 비교한 코드
//        @Override
//        public int compare(Student o1, Student o2) {
////            if (o1.sno < o2.sno) return -1;
////            else if(o1.sno == o2.sno) return 0;
////            else return 1;
//
//
//
//            return Integer.compare(o1.sno, o2.sno);
//        }
//


        //이름을 가지고 두객체를 비교
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.name.compareTo(o2.name) < 0) return 0;
            else if(o1.name.compareTo(o2.name) == 0) return 0;
            else return 1;

        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("오치식", 0);
        Student s2 = new Student("오태식", 1);
        Student s3 = new Student("우민식", 3);

        //정적멤버클래스인 비교자 인스턴스 생성
        StudentComparator sc = new StudentComparator();
        int result = Objects.compare(s1,s2,sc);
        System.out.println("result 의 값 : " + result);

        result = Objects.compare(s1, s2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
            if (o1.sno < o2.sno) return -1;
            else if(o1.sno == o2.sno) return 0;
            else return 1;



        }

        });

        System.out.println("result 의 값 : " + result);

    }
}
