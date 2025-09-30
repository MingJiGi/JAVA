package gemini_smartDevice;

// SmartDevice 상속 제거, 제네릭 T에만 경계 설정
public class DeviceBox<T extends SmartDevice>{

    private T device;


    public T getDevice() {
        return device;
    }

    public void setDevice(T device) {
        this.device = device;
    }
}