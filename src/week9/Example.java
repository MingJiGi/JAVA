package week9;
class Power{
    public int kick;
    public int punch;

    public Power(int kick, int punch) {
        this.kick = kick;
        this.punch = punch;
    }
}



public class Example {
    public static void main(String[] args) {
        Power robot = new Power(10,20);
    }
}
