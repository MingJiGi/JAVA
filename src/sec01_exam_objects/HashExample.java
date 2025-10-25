package sec01_exam_objects;

import java.util.Arrays;
import java.util.Objects;

public class HashExample {

    static class Student{
        int sno;
        String name;
        int[] arr;

        public Student(int[] arr, String name, int sno) {
            this.arr = arr;
            this.name = name;
            this.sno = sno;
        }

        @Override
        public int hashCode() {


            return Objects.hash(this.sno, this.name, Arrays.toString(arr));
            //하위 호환을 위해서 아래와 같이 쓸수도 있다.
//            return this.sno + this.name.hashCode() + this.arr[0] + this.arr[1];
        }
    }


    public static void main(String[] args) {

        Student s1 = new Student(new int[]{100,100},"홍길동",1);
        Student s2 = new Student(new int[]{100,100},"홍길동",1);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
