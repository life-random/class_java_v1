package exercise;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0; // 주문한 아메리카노의 수

        // 주문
        while (true) {
            System.out.println("아메리카노 한잔에 2,500원 입니다.\n" +
                    "몇 잔을 주문하시겠습니까?");
            count = sc.nextInt();
            sc.nextLine();
            if (count > 0)
                break;
            System.out.println("1잔 이상 주문해야 합니다.");
        }

        // 정산
        System.out.println("총 결제 금액: " + 2500 * count + "원");
        if (count >= 3){
            System.out.println("3잔 이상 구매 서비스 스탬프 발급:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        sc.close();
    } // end of main
} // end of class
