package sec04_exam_generic_method_2;

import OsanChapter05.Tv;
import Person.Car;
import sec07_exam_anonumousImplemants.Parent;

public class CompareMathodExample {


    public static void main(String[] args) {


//        Pair<Integer, String> p1 = new Pair<>(1, "사과");
//        Pair<Integer, String> p2 = new Pair<>(1, "사과");
//
        Pair<Integer, Apple> p1 = new Pair<>(1, new Apple(10));
        Pair<Integer, Apple> p2 = new Pair<>(1, new Apple(10));


        if (Util.compare(p1,p2)){
            System.out.println("논리적으로 동등객체이다");
        }else {
            System.out.println("논리적으로 동등하지 않은 객체이다");
        }

        Pair<Integer, Car>p3  = new Pair<>(1, new Car());
        Pair<Integer, Car>p4  = new Pair<>(1, new Car());


        if (Util.compare(p3,p4)){
            System.out.println("논리적으로 동등객체이다");
        }else {
            System.out.println("논리적으로 동등하지 않은 객체이다");
        }

        Pair<Integer, Tv>p5 = new Pair<>(1, new Tv(20));
        Pair<Integer, Tv>p6 = new Pair<>(1, new Tv(20));

        if (Util.compare(p5,p6)){
            System.out.println("논리적으로 동등객체이다");
        }else {
            System.out.println("논리적으로 동등하지 않은 객체이다");
        }


    }


}
