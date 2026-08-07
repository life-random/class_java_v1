package ch08;

import java.util.Scanner;

public class MenuChoice2 {
    public static void main(String[] args) {

        // 도전 과제. (코드 추가하거나 수정)
        // 프로그램 종료시 사용자가 메뉴를 누른 횟수를 출력할 수 있게 코드를 수정하세요
        // 예시) 메뉴를 xxx번 선택했습니다 <--- 출력
        // 1 - 4 까지만 횟수로 인정

        Scanner sc = new Scanner(System.in);

        final int CREATE = 1;
        final int READ = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int END = 0;

        int createCount = 0;
        int readCount = 0;
        int updateCount = 0;
        int deleteCount = 0;

        while (true) {

            System.out.println("\n 메뉴선택");
            System.out.println("1. 등록 2. 조회 3. 수정 4. 삭제 0. 종료");
            System.out.print("선택 : ");
            int choice = sc.nextInt();

            if (choice == CREATE){

                System.out.println("등록을 선택했습니다");
                createCount++;

            } else if (choice == READ){

                System.out.println("조회를 선택했습니다");
                readCount++;

            } else if (choice == UPDATE){

                System.out.println("수정을 선택했습니다");
                updateCount++;

            } else if (choice == DELETE){

                System.out.println("삭제를 선택했습니다");
                deleteCount++;

            } else if (choice == END ){

                System.out.println("프로그램을 종료합니다");
                System.out.println("--누적 사용 이력--\n" +
                        "등록 : " + createCount + "회\n" +
                        "조회 : " + readCount + "회\n" +
                        "수정 : " + updateCount + "회\n" +
                        "삭제 : " + deleteCount + "회\n" +
                        "모든 서비스 이용 이력 : " + (createCount + readCount + updateCount + deleteCount) + "회");
                break; // while문 해제

            } else {

                System.out.println(choice + "잘못된 입력입니다");

            } // end of if - else

        } // end of while

        sc.close();

    } // end of main

} // end of class