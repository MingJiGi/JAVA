package Person;

public class overloadingExample {
    public static void main(String[] args) {
        Overloading a = new Overloading();
        System.out.println("Overloading.add(3.3) 결과 : " + a.add(3,3));
        System.out.println("Overloading.add(3L.3) 결과 : " + a.add(3L,3));
        System.out.println("Overloading.add(3.3L) 결과 : " + a.add(3,3L));
        System.out.println("Overloading.add(3L.3L) 결과 : " + a.add(3L,3L));

        int[] arr = new int[] {100,200,300};

        System.out.println("Overloading.add(int[] a) 결과 : " + a.add(arr));
        System.out.println("Overloading.add(int [] a) 결과 : " + a.add(new int[] {500,600,700}));

    }
}
