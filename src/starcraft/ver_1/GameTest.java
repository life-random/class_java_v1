package starcraft.ver_1;

import java.util.Scanner;

public class GameTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int MARINE = 1;
        final int ZEALOT = 2;
        final int ZERGLING = 3;
        final int END = 0;

        Zealot zealot = new Zealot("질럿");
        Marine marine = new Marine("마린");
        Zergling zergling = new Zergling("저글링");

        while (true){
            System.out.println("유닛을 선택해주세요");
            System.out.println("1.마린  2.질럿  3.저글링  0.종료");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == MARINE) { // 유닛 마린 선택
                while (true){
                    System.out.println("공격 대상 선택");
                    System.out.println("1.마린(상태확인)  2.질럿  3.저글링  0.뒤로가기");
                    choice = sc.nextInt();
                    sc.nextLine();

                    if (choice == MARINE) {
                        marine.showInfo();
                    } else if (choice == ZEALOT) {
                        marine.attackZealot(zealot);
                    } else if (choice == ZERGLING) {
                        marine.attackZergling(zergling);
                    } else if (choice == END) {
                        break;
                    } else {
                        System.out.println("잘못된 입력입니다");
                    }
                }


            } else if (choice == ZEALOT) { // 유닛 질럿 선택
                while (true){
                    System.out.println("공격 대상 선택");
                    System.out.println("1.마린  2.질럿(상태확인)  3.저글링  0.뒤로가기");
                    choice = sc.nextInt();
                    sc.nextLine();

                    if (choice == MARINE) {
                        zealot.attackMarine(marine);
                    } else if (choice == ZEALOT) {
                        zealot.showInfo();
                    } else if (choice == ZERGLING) {
                        zealot.attackZergling(zergling);
                    } else if (choice == END) {
                        break;
                    } else {
                        System.out.println("잘못된 입력입니다");
                    }
                }

            } else if (choice == ZERGLING) { // 유닛 저글링 선택
                while(true){
                    System.out.println("공격 대상 선택");
                    System.out.println("1.마린  2.질럿  3.저글링(상태확인)  0.뒤로가기");
                    choice = sc.nextInt();
                    sc.nextLine();

                    if (choice == MARINE) {
                        zergling.attackMarine(marine);
                    } else if (choice == ZEALOT) {
                        zergling.attackZealot(zealot);
                    } else if (choice == ZERGLING) {
                        zergling.showInfo();
                    } else if (choice == END) {
                        break;
                    } else {
                        System.out.println("잘못된 입력입니다");
                    }
                }

            } else if (choice == END) {
                System.out.println("시스템을 종료합니다");
                break;

            } else {
                System.out.println("잘못된 입력입니다");
            }
        }

        sc.close();
    } // end of main
} // end of class
