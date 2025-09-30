package MingJiGi;

public class TupleTest {
    public static void main(String[] args) {

        Tuple<String, Integer> Tuple1 = new Tuple<>("서울시",9700000);
        Tuple<Double, Boolean> Tuple2 = new Tuple<Double,Boolean>(3.14159, true);

        System.out.println("Tuple1 : " + Tuple1.getKey() + Tuple1.getValue());
        System.out.println("Tuple2 : " + Tuple2.getKey() + Tuple2.getValue());







    }
}
