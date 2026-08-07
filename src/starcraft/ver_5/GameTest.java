package starcraft.ver_5;

import java.util.Scanner;

/**
 * <h1>StarCraft 게임 실행 테스트 클래스</h1>
 * 메인 메뉴를 통해 유닛(마린, 질럿, 저글링)을 선택하고,
 * 각 유닛 간의 공격 및 상태 확인 동작을 콘솔 환경에서 제어합니다.
 *
 * <p><b>수정 이력:</b></p>
 * <ul>
 *   <li>2026.08.03 - [v4.0] ver_4  다향성 적용을 위해 각 Unit 클래스 하위 클래스 객체에 업 캐스팅 적용</li>
 *   <li>2026.07.31 - 각 클래스의 attack 메서드 오버로딩 적용에 따른 호출부 반영</li>
 * </ul>
 *
 * @author 최병권
 * @version 4.0
 */
public class GameTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int MARINE = 1;
        final int ZEALOT = 2;
        final int ZERGLING = 3;
        final int END = 0;

        Unit zealot = new Zealot("질럿");
        Unit marine = new Marine("마린");
        Unit zergling = new Zergling("저글링");

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
                        marine.attack(zealot);
                    } else if (choice == ZERGLING) {
                        marine.attack(zergling);
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
                        zealot.attack(marine);
                    } else if (choice == ZEALOT) {
                        zealot.showInfo();
                    } else if (choice == ZERGLING) {
                        zealot.attack(zergling);
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
                        zergling.attack(marine);
                    } else if (choice == ZEALOT) {
                        zergling.attack(zealot);
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
