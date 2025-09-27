package MingJiGi;

import sec_verify02.Account;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class LMS{

    private String name, stNum, sugang;
    int age;
    Vector<LMS> Account = new Vector<LMS>();
    public static LMS lms = new LMS();

    public static Scanner in = new Scanner(System.in);
    public LMS() {
    }

    public LMS(String name, String stNum, int age) {
        this.name = name;
        this.stNum = stNum;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getStNum() {
        return stNum;
    }

    public int getAge() {
        return age;
    }

    public LMS(String sugang) {
        this.sugang = sugang;
    }

    public static void CreateAccount() {
        System.out.print("학생 이름 : ");
        String name = in.next();
        System.out.print("학생 학번 : ");
        String stNum = in.next();
        System.out.print("학생 나이 : ");
        int age = in.nextInt();

        lms.Account.add(new LMS(name, stNum, age));
    }

    public static void Show(){
        if (lms.Account.isEmpty()){
            System.out.println("학생목록이 존재하지 않습니다.");
            return;
        }
        for (int i = 0; i < lms.Account.size(); i++) {
            System.out.println(lms.Account.get(i));
        }
    }

    public static void Remove(){
        System.out.print("삭제할 학생의 학번을 입력해주세요 : ");
        String stNum = in.next();
        for (int i = 0; i < lms.Account.size(); i++) {
            LMS Student = (LMS)lms.Account.get(i);
            if (stNum.equals(Student.stNum)){
                lms.Account.remove(i);
                System.out.println("해당학생 정보를 삭제 했습니다. ");
            }else System.out.println("삭제할 대상이 존재하지 않습니다.");
        }
    }

    public static void registerClass() {
        System.out.print("수강 신청할 학생의 학번을 입력하세요: ");
        String stNumInput = in.next();
        System.out.print("수강 신청 과목을 입력하세요: ");
        String subject = in.next();

        for (int i = 0; i < lms.Account.size(); i++) {
            LMS student = (LMS)lms.Account.get(i);
            if (stNumInput.equals(student.getStNum())) {
                student.sugang = subject;  // 해당 학생에 과목 저장
                System.out.println("수강 신청 완료.");
                return;
            }
        }
        System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
    }

    public static void registerClassShow(){
        System.out.print("수강목록 확인할 학번을 입력하세요 : ");
        String stNum = in.next();
        for (int i = 0; i < lms.Account.size(); i++) {
            LMS a = (LMS) lms.Account.get(i);
            if (stNum.equals(a.stNum)){
                String sugang1 = a.sugang;
                System.out.println("당신의 수강신청 목록 : " + sugang1);
            }else System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
        }
    }

    public void capacityShow(){
        System.out.println("현재 저장된 데이터 갯수 : " + lms.Account.size() + "Byte");
        System.out.println("데이터 용량 : " + lms.Account.capacity() + "Byte");
    }

    @Override
    public String toString() {
        return "학생이름 : " + getName() +"\n" +
                "학생 학번 : " + getStNum() +"\n" +
                "학생 나이 : " +getAge();
    }
}
