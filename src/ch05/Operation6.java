package ch05;

public class Operation6 {
    // 코드의 시작점
    public static void main(String[] args) {
        // 논리 연산자 (&&, ||, !)
        int num1 = 100;
        int num2 = 200;

        // 1. 논리곱( && )
        //                  T      &&      T    --> T
        boolean flag1 = (num1 > 0) && (num2 > 0);
        System.out.println("flag1 : " + flag1);
        //                  T      &&     F     --> F
        boolean flag2 = (num1 > 0) && (num2 < 0);
        System.out.println("flag2 : " + flag2);

        // 2. 논리합( || )
        //                  T      ||    T      --> T
        boolean flag3 = (num1 > 0) || (num2 > 0);
        System.out.println("flag3 : " + flag3);
        //                  F      ||    T      --> T
        boolean flag4 = (num1 < 0) || (num2 > 0);
        System.out.println("flag4 : " + flag4);
        //                  F      ||    F      --> F
        boolean flag4_1 = (num1 < 0) || (num2 < 0);
        System.out.println("flag4_1 : " + flag4_1);

        // 정리
        // 논리 곱 - 둘 다 참(true)일 때 true을 반환
        // 논리 합 - 둘 중 하나라도 참(true)일 때 true 반환

        // 부정 논리 연산자 확인
        System.out.println(!true); // false
        System.out.println(!false); // true

    } // end of main

} // end of class
