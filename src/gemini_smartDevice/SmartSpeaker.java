package gemini_smartDevice;

public class SmartSpeaker extends SmartDevice{
    private int volum;

    public SmartSpeaker(String name) {
        super(name);
        this.volum = 5; // 볼륨 초기값 설정
    }

    public void volumUp(){
        this.volum ++;
    }
    public void volumDown(){
        this.volum --;
    }


    @Override
    public String getStatus() {
        return this.name + "의 현재 상태: [볼륨: " + this.volum + ", 전원: " + (isOn ? "ON" : "OFF") + "]";
    }
}