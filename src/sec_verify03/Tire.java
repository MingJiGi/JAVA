package sec_verify03;


//Super Class
public class Tire {
    int maxRotation, accumulateRotation; // 최대 회전수 , 누적 회전수
    String location; // 타이어 위치



    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll(){
        boolean result = false;
        this.accumulateRotation++;

        //누적된 횟수가 최대 회전수 보다 적다면
        if (this.accumulateRotation < this.maxRotation){
            System.out.println(this.location + "Tire 수명 : " + (this.maxRotation - this.accumulateRotation) + "회");
            result = true;
            //누적된 횟수가 최대 회전수 보다 같으면...
        }else {
            // 앞오른쪽 Tire 펑크
            System.out.println("***" + this.location + "타이어 펑크 ***");
            result = false;
        }
        return result;
    }

}
