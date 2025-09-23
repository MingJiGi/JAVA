package sec_verify02;

public class MoutainBikeExample {
    public static void main(String[] args) {
        MoutainBike mtb1 = new MoutainBike(20091098, "scptt","카본","8천만",30);
        mtb1.prtinfo();
        System.out.println();

        MoutainBike mtb2 = new MoutainBike(20160315, "Giant","알미늄","30만",27);
        mtb1.prtinfo();
        System.out.println();

        MoutainBike mtb3 = new MoutainBike(20100315, "Lespo","철","5천만",18);
        mtb1.prtinfo();
        System.out.println();

    }
}
