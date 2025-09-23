package sec01_exam_OverridingExample;

//조상클래스
public class HddDisk {


        //멤버변수
        int capacity; // 하드디스크의 용량
        int rpm; // 하드디스크의 속도

    public HddDisk() {
    }

    public HddDisk(int capacity, int rpm){
        super(); // object 호출
        this.capacity = capacity;
        this.rpm = rpm;
    }

        public String Status () {
            return "하드디스크의 용량은" + this.capacity + "GB이며." +
                    "RPM은 " + this.rpm +"입니다.";
    }


}
