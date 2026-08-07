package ch08;

import java.util.Scanner;

public class BreakTest2 {
    public static void main(String[] args) {

        // 문제 1. 1부터 100까지 화면에 출력
        //     2. 3의 배수만 화면에 출력하시오
        //     3. 50이상이면 반복문을 종료 시키세요
        //     4. for 구문으로 코드 작성

        for (int i = 3; i < 100; i += 3) {
            if (i >= 50)
                break;
            System.out.println("i : " + i);
        }

        // 연습 문제
        // 1. 값을 입력을 받고 그 수까지 진행하는 반복문을 만든다
        // 2. 5의 배수만 화면에 출력을 한다
        // 3. while문으로 코드를 작성한다
        // 4. 입력 받은 값의 2/3 지점보다 크다면 종료 시킨다
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 :");
        final int MAX = sc.nextInt();
        int start = 0;

        while ((MAX * 2 / 3) > start){
            start++;
            if (start % 5 == 0)
                System.out.println("start : " + start);
        }
    } // end of main

} // end of class
