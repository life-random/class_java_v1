package exercise;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int maxNumber = scanner.nextInt();
        if (maxNumber <= 0) {
            System.out.println("0보다 큰 수를 입력해주세요");
            return;
        }
        int sum = 0;

        for (int i = 1; i <= maxNumber; i++) {
            sum += i;
        }

        System.out.println("짝수의 합: " + sum);
        scanner.close();
    } // end of main

} // end of class
