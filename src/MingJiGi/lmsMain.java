package MingJiGi;

import MingJiGi.LMS;

import static MingJiGi.LMS.Remove;

public class lmsMain {
    public static void main(String[] args) {

        LMS lms = new LMS();

        while (true){
            System.out.println("--------------");
            System.out.println("학생이력관리 시스템");
            System.out.println("--------------");
            System.out.println("1 : 학생등록, 2 : 학생목록보기, 3 : 학생정보 삭제, 4 : 수강신청, 5 : 수강신청 목록 보기, 6 : 용량확인, 7 : 종료");
            int UserChoice = lms.in.nextInt();

            if (UserChoice == 1) lms.CreateAccount();
            if (UserChoice == 2) lms.Show();
            if (UserChoice == 3) lms.Remove();
            if (UserChoice == 4) lms.registerClass();
            if (UserChoice == 5) lms.registerClassShow();
            if (UserChoice == 6) lms.capacityShow();
            if (UserChoice == 7) break;
            else if (UserChoice > 7) System.out.println("잘못선택 하셧습니다");
        }

    }
}
