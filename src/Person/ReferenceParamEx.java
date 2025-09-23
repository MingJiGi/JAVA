package Person;

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = "+  d.x);
        System.out.println("d의 주소 : " + d.toString());
        change(d);
        System.out.println("After change (d)");
        System.out.println("main () : x = " + d.x);

        int[] arr = new int[]{1,2};
        System.out.println("arr의 주소값 : "+ arr.toString());
        System.out.println("Before : " + arr[1]);
        arr_change(arr);
        System.out.println("After : "+arr[1]);

    }

    public static void change(Data d){
        System.out.println("d의 주소 : " + d.toString());
        d.x = 1000;
        System.out.println("change() : d.x = "+ d.x);
    }
    public static void arr_change(int[] arr){
        System.out.println("arr_change 의 주소값 :" + arr.toString());
        arr[1] = 10;
        System.out.println(arr[1]);
    }
}
