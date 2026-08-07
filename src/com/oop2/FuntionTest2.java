package com.oop2;

public class FuntionTest2 {

    // 세 개의 수를 입력 받아 뺄셈하는 함수를 설계하고, 그 값을 반환하는 함수르 만들어 보자
    static int sub(int a, int b, int c) {
        int result = a - b - c;
        return result;
    }

    // 리턴 키워드가 없는 함수를 만들어 보자.
    // void <- 텅 빈, 값이 없는...
    static void sqyHello(String greeting) {
        System.out.println("[[[" + greeting + "]]] ~~~ 👌");
    }

    // 매개변수가 없는 함수를 설계해보자
    static int calcSum() {
        // 지역 변수는 가능한 초기값을 먼저 할당 하자
        int sum = 0;
        int i;

        for (i = 0; i <= 100; i++) {
            sum += i;
        }

        return sum;
    }

    // 맨 마지막에 메인 함수 설계 할 예정
    // 코드의 시작점 (메인함수) JVM - Stack에 할당 됨
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        // sub(int a, int b, int c)
        // 함수 호출 시 들어가는 값을 인수라고 한다
        int result = sub(num1, num2, 10);

        // 함수는 여러번 재활용하기 위함이다
        sqyHello("안녕 함수와 반가워");
        sqyHello("안녕 자바");

        int result2 = calcSum();
        System.out.println("result1 : " + result);
        System.out.println("result2 : " + result2);

    } // end of main
} // end of class
