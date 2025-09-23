package Osan.Example;

public class Add {
    Add(){
        System.out.println("기본 생성자 Add() 호출");
    }
    Add(int a, int b){
        System.out.println("일반 생성자 Add(int a, int b)호출");
        System.out.println(a + " + " + b + " = " + (a+b));
    }
    Add(double a, double b){
        System.out.println("일반 생성자 Add(double a, double b) 호출");
        System.out.println(a + " + " + b + " = " + (a+b));

    }
    Add(int a, double b){
        System.out.println("일반 생성자 Add(int a, double b)호출");
        System.out.println(a + " + " + b + " = " + (a+b));

    }

    public static void main(String[] args) {
        Add numObj1 = new Add(1,2);

        Add numObj2 = new Add(2.4,6.2);

        Add numObj3 = new Add(3,5.5);
    }

}
