package sec01_exam_OverridingExample;

public class HddExample {
    public static void main(String[] args) {
        HddDisk hddDisk = new HddDisk(500, 7200);
        UsbMemory usbMemory = new UsbMemory(32, 520);

        String str = hddDisk.Status(); // 조상클래스의 값

        System.out.println(str);

        str = usbMemory.Status(); // 자식클래스에서 조상클래스로 10하고 50을 넘겨주고 오버라이딩에서 조상의
        // 값을 찍엇기 때문에 32 와 520을 넘겨줘도 결국엔 10하고 50이 찍힘 )

        System.out.println(str);

    }
}
