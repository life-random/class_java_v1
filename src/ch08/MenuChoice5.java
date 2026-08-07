package ch08;

import java.util.Scanner;

public class MenuChoice5 {
    // CRUD
    // 변수를 name을 사용해서 CRUD 구현을 해보자.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int CREATE = 1;
        final int READ = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int END = 0;
        String name = null;
        while (true) {

            System.out.println("\n 메뉴선택");
            System.out.println("1. 등록 2. 조회 3. 수정 4. 삭제 0. 종료");
            System.out.print("선택 : ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == CREATE) {
                // name 변수에 스캐너를 사용해서 이름을 등록하는 기능을 구현
                System.out.println("등록을 선택했습니다");
                if (name == null) { // 계정이 없을 시
                    System.out.print("name을 입력해주세요 : ");
                    name = sc.next();
                    sc.nextLine();
                    System.out.println("name의 등록이 완료되었습니다");
                } else { // 계정이 있을 시
                    System.out.println("현재 " + name + "님은 계정이 등록되어 있습니다");
                }

            } else if (choice == READ) {
                // name안에 담겨진 값을 출력하는 기능 구현
                System.out.println("조회를 선택했습니다");
                if (name == null) { // 계정이 없을 시
                    System.out.println("현재 등록된 name은 없습니다\n" +
                            "등록을 먼저 해주십시오");
                } else { // 계정이 있을 시
                    System.out.println("현재 name은 " + name + "입니다");
                }
            } else if (choice == UPDATE) {
                // name을 수정하는 기능 구현
                System.out.println("수정을 선택했습니다");
                if (name == null) { // 계정이 없을 시
                    System.out.println("현재 등록된 name은 없습니다\n" +
                            "등록을 먼저 해주십시오");
                } else { // 계정이 있을시
                    System.out.println("현재 name은 " + name + "입니다");
                    System.out.print("변경하실 name을 입력해주세요 : ");
                    name = sc.next();
                    sc.nextLine();
                    System.out.println(name + "으로 변경이 완료되었습니다");
                }
            } else if (choice == DELETE) {
                // name을 삭제하는 기능을 구현
                System.out.println("삭제를 선택했습니다");
                if (name == null) { // 계정이 없을 시
                    System.out.println("현재 등록된 name은 없습니다\n" +
                            "등록을 먼저 해주십시오");
                } else { // 계정이 있을시
                    // 계정삭제 여부를 다시 한 번 확인
                    System.out.print("정말로 계정을 삭제하시겠습니까?(Y/N) : ");
                    String deleteRecheck = sc.next();
                    sc.nextLine();
                    // 계정 삭제 동의
                    if (deleteRecheck.equalsIgnoreCase("Y")) {
                        name = null;
                        System.out.println("계정 삭제가 완료되었습니다");
                    }
                    // 계정 삭제 거부
                    else if (deleteRecheck.equalsIgnoreCase("N")) {
                        System.out.println("계정 삭제를 중지하겠습니다");
                    } else { // 잘못된 입력
                        System.out.println("잘못된 입력으로 다시 메뉴로 돌아갑니다");
                    }
                }
            } else if (choice == END) {
                System.out.println("프로그램을 종료합니다");
                break; // while문 해제
            } else {
                System.out.println(choice + "잘못된 입력입니다");
            } // end of if - else
        } // end of while
        sc.close();
    } // end of main
} // end of class