package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Coffee {
    private static final int COFFEE_PRICE = 2_500;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("주문하실 커피 잔 수를 입력하세요");
        int count;
        while (true){
            try {
                count = count = Integer.parseInt(sc.nextLine());

                if (count <= 0){
                    System.out.println("1잔 이상을 주문해주세요");
                    continue;
                }
            } catch (NumberFormatException e){
                System.out.println("숫자로 입력해주세요");
                continue;
            }
            break;
        }
        System.out.println("총 결제 금액 : " + (COFFEE_PRICE * count) );
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
    }
}
