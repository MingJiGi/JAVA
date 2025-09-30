package gemini_smartDevice;

public class ManagementSystem {
    public static void main(String[] args) {

        Controllable[] List = new Controllable[]{new SmartTv("LG TV"), new SmartSpeaker("Samsung Speaker")};

        System.out.println("--- 다형성을 이용한 전원 켜기 ---");
        for (Controllable a : List) {
            a.turnOn();
        }

        DeviceBox<SmartTv> smartTvBox = new DeviceBox<>();
        DeviceBox<SmartSpeaker> smartSpeakerBox = new DeviceBox<>();

        smartTvBox.setDevice((SmartTv) List[0]);
        smartSpeakerBox.setDevice((SmartSpeaker) List[1]);

        System.out.println("\n--- 제네릭 박스에서 상태 꺼내기 ---");
        System.out.println(smartTvBox.getDevice().getStatus());
        System.out.println(smartSpeakerBox.getDevice().getStatus());
    }
}
