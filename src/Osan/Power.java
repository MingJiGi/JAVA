package Osan;

public class Power {
    public int kick;
    public int punch;

    public void set(int a , int b){
        kick = a;
        punch = b;
    }


    public static void main(String[] args) {
        Power robot = new Power();
        robot.set(10,20);
        System.out.println(robot.kick + "" + robot.punch);
    }

}