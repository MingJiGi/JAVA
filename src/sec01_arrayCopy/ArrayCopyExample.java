package sec01_arrayCopy;

import java.util.Arrays;

public class ArrayCopyExample {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        //복사 속도 측정 변수
        long start = 0L;
        long end = 0L;

        //10의 -3승은 millis, 10의 -6승 micro, 10의 -9승은 nano
        //배열 복사 1번째 방법(copyOf())
        start = System.nanoTime();
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        end = System.nanoTime();
        System.out.println("copyOf()복사 속도 : " + (end - start));
        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));

        //배열 복사 방법 2(copyOfRange()) 사용
        start = System.nanoTime();
        int[] arr3 = Arrays.copyOfRange(arr1, 0, arr1.length);
        end = System.nanoTime();
        System.out.println("copyRange()복사 속도 : " + (end - start));
        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr3 : " + Arrays.toString(arr3));

        //배열 복사 방법 3(System클래스의 메서드인 arraycopy() 사용)
        int[] arr4 = new int[10];
        start = System.nanoTime();
        System.arraycopy(arr1, 0, arr4, 0 , arr1.length);
        end = System.nanoTime();
        System.out.println("System.arraycopy()복사 속도 : " + (end - start));
        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr3 : " + Arrays.toString(arr4));


        //반복문을 이용한 출력
        start = System.nanoTime();
        int[] arr5 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr5[i] = arr1[i];
        }
        end = System.nanoTime();
        System.out.println("for()복사 속도 : " + (end - start));

    }
}
