package osan_abstract;

import java.util.Arrays;

public class GoodCalc extends Calculator{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    @Override
    public double average(int[] a) {
        double sum = 0;
        for (int b : a){
            sum += b;
        }
        return sum / a.length;
    }

    @Override
    public int gop(int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {
        GoodCalc c = new GoodCalc();
        System.out.println("더하기 연산 : " + c.add(2,3));
        System.out.println("빼기 연산 : " + c.subtract(2,3));
        System.out.println("곱셈 : " + c.gop(2,3));
        System.out.println("평균 연산 : " + c.average(new int[] {2,3,4}));
    }
}
