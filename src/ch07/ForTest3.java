package ch07;

public class ForTest3 {
    public static void main(String[] args) {

        // 1부터 100까지 수 중 총합을 구하시오.
        // 홀수만 덧셈해서 구하는 총합을 담아주세요
        // 1 + 2 + 3 + 4 ... + 100;
        int sum = 0;

        for (int i = 1; i <= 100; i++)
            if (i % 2 == 1)
                sum += i;
        System.out.println("sum : " + sum);

        // 반복문의 증강식을 2씩 증가 시켜보자
        for (int i = 0; i < 10; i += 2) {
            System.out.println("2씩 증가 + " + i);
        }

        // 문제 = 화면에 10 9 8 7 6 5 4 3 2 1을 출력하는 코드를 작성하시오
        for (int i = 10; i > 0; i--)
            System.out.println(i);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 1; i < 8; i += 2) {
            System.out.println("*".repeat(i));
        }

    } // end of main

} // end of class
