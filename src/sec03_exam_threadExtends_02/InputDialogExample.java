package sec03_exam_threadExtends_02;

import javax.swing.*;

public class InputDialogExample {

    public static void main(String[] args) {

        Thread thread = new TimerThread();
        thread.start();
        String str =  JOptionPane.showInputDialog("아무 값이나 입력하세요");
        System.out.println("입력하신 값은  " + str + "입니다.");
    }
}
