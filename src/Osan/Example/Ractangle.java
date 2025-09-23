package Osan.Example;

import java.util.Scanner;

public class Ractangle {
    int width, height;

    public int getArea(){
        return width * height;
    }
    public static void main(String[] args) {
        Ractangle rect = new Ractangle();
        Scanner in = new Scanner(System.in);
        System.out.println(">> ");

        rect.width = in.nextInt();
        rect.height = in.nextInt();
        System.out.println(rect.getArea());
        in.close();
    }
}
