package sec01_format;

import java.text.DecimalFormat;

public class DecimalFormatExmaple {
    public static void main(String[] args) {

        double num = 1234567.89;

        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(num));

        //0으로 format을 잡으면 자리를 먹는다.
        df = new DecimalFormat("00000000.00000000");
        System.out.println(df.format(num));

        df = new DecimalFormat("#");
        System.out.println(df.format(num));

        df = new DecimalFormat("#.#");
        System.out.println(df.format(num));

        df = new DecimalFormat("###################.#################");
        System.out.println(df.format(num));

        df = new DecimalFormat("##################.00");
        System.out.println(df.format(num));


    }
}
