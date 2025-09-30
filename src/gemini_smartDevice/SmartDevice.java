package gemini_smartDevice;

public abstract class SmartDevice implements Controllable{
    protected String name;
    protected boolean isOn;

    public SmartDevice(String name) {
        this.name = name;
    }

    @Override
    public abstract String getStatus();

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println(this.name + "이(가) Off 상태입니다.");
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println(this.name + "이(가) On 상태입니다.");
    }
}