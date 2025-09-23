package Osan;

public class Television {
    private int channel, volume;
    private boolean onOff;

    public Television(int channel, int volume, boolean onOff){
        this.channel = channel;
        this.volume = volume;
        this.onOff = onOff;
    }
    void print(){
        System.out.println("채널은" + channel + "이고 불륨은" + volume + " 입니다");
    }

    public static void main(String[] args) {
        Television myTv = new Television(7, 10, true);
        myTv.print();
        Television yourTv = new Television(11, 20, true);
        yourTv.print();

    }
}
