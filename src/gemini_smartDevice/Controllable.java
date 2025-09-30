package gemini_smartDevice;

public interface Controllable {
    void turnOn();
    void turnOff();

    // 상태를 출력하는 대신 문자열로 반환하도록 수정 (좋은 설계)
    String getStatus();
}