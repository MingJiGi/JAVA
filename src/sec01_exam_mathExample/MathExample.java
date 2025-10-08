package sec01_exam_mathExample;

public class MathExample {
    public static void main(String[] args) {
        //절대값
        int v1 = Math.abs(-5);
        double v2 = Math.abs(-3.14);
        System.out.println("V1 = " + v1);
        System.out.println("V2 = " + v2);


        //올림값
        double v3 = Math.ceil(5.3);
        double v4 = Math.ceil(-5.3);
        System.out.println("V3 = " + v3);
        System.out.println("V4 = " + v4);


        //내림값
        double v5 = Math.floor(5.3);
        double v6 = Math.floor(-5.3);
        System.out.println("V5 = " + v5);
        System.out.println("V6 = " + v6);


        //둘중 큰값
        double v7 = Math.max(5,9);
        double v8 = Math.max(5.3,2.5);
        System.out.println("V7 = " + v7);
        System.out.println("V8 = " + v8);

        //둘중 작은값
        double v9 = Math.min(5,9);
        double v10 = Math.min(5.3,2.5);
        System.out.println("V9 = " + v9);
        System.out.println("V10 = " + v10);

        double v11 = Math.random();
        System.out.println("V11 = " + v11);

        //가까운 정수의 실수값
        double v12 = Math.rint(5.3);
        double v13 = Math.rint(5.7);
        System.out.println("V12 = " + v12);
        System.out.println("V13 = " + v13);



    }
}

