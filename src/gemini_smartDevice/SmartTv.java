package gemini_smartDevice;

/**
 * 3. SmartTv 클래스: SmartDevice 상속 (구체적인 구현)
 */
public class SmartTv extends SmartDevice{
    private int channel;
    private int volum;

    public SmartTv(String name) {
        super(name);
        this.channel = 5;
        this.volum = 10;
    }

    public void channelUp(){ this.channel ++; }
    public void channelDown(){ this.channel --; }
    public void volumUp(){ this.volum ++; }
    public void volumDown(){ this.volum --; }

    // 추상 메서드 String getStatus() 구현
    @Override
    public String getStatus() {
        return "TV [" + this.name + "] | 채널: " + this.channel + ", 볼륨: " + this.volum + ", 전원: " + (isOn ? "ON" : "OFF");
    }
}
