package sec01_exam_OverridingExample;

//자손클래스
public class UsbMemory extends HddDisk{

    int capacity;
    int rpm;


    public UsbMemory(int capacity, int rpm){
        super(10,50);
        this.capacity = capacity;
        this.rpm = rpm;

    }

    @Override
    public String Status() {
        return "USB의 메모리 용량은 " + super.capacity + "GB이며" +
        "RPM은" + super.rpm + "입니다.";
    }
}
