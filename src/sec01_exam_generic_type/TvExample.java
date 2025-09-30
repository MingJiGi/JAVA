package sec01_exam_generic_type;

public class TvExample {
    public static void main(String[] args) {
        TV<String> tv1 = new TV<>();
        tv1.setT("LG OLED TV");
        String str = tv1.getT();

        System.out.println(str);
        System.out.println();

        TV<Integer> tv2 = new TV<>();
        tv2.setT(46); // 자동박싱
        System.out.println("나의 TV는 "+ str +" 이며"+"크기는 "+tv2.getT());




    }
}


// (위와 같이 제네릭 코드는 타입변환을 제거하면서, 프로그램 성능을 향상시키고
// 아울러, 다양한 타입을 지정하여 개발할 수 있는 장점이 있다. 또한, 컬렉션에서는
// 데이터의 통일화를 가져와서 신뢰도를 높여준다, 또한 실행시 예외가 발생하는 것보다는
// 컴파일시 예외가 발생하는게 훨씬 프로그래머한테는 도움이 되는 것이다.)
