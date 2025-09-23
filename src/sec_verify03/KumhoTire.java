package sec_verify03;

public class KumhoTire extends Tire{

    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        boolean result = false;
        this.accumulateRotation++;

        //누적된 횟수가 최대 회전수 보다 적다면
        if (this.accumulateRotation < this.maxRotation){
            System.out.println(this.location + "KumhoTire 수명 : " + (this.maxRotation - this.accumulateRotation) + "회");
            return true;
            //누적된 횟수가 최대 회전수 보다 같으면...
        }else {
            // 앞오른쪽 Tire 펑크
            System.out.println("***" + this.location + "kumhoTire 펑크 ***");
            return false;
        }
    }
}

