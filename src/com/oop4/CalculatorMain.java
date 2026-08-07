package com.oop4;

public class CalculatorMain {

    // 두 숫자를 더하는 함수
    static int add(int num1, int num2) {
        return num1 + num2;
    }

    // 두 숫자를 빼는 함수
    static int sub(int num1, int num2) {
        return num1 - num2;
    }

    // 두 숫자를 곱하는 함수
    static int mul(int num1, int num2) {
        return num1 * num2;
    }

    // 두 숫자를 나누는 함수
    static double div(int num1, int num2) {
        if (num2 == 0){
            System.out.println("0은 잘못된 입력입니다");
            return 0;
        }
        // 정수 / 정수 -->  정수 (소수점 버려짐)
        // (double) 둘 중 하나라도 실수 데이터 타입이어야 소수점을 반환 한다.
        return (double) num1 / num2;
    }

    // 짝수인지 판별하는 함수
    static boolean checkEven(int num) {
        return (num % 2 == 0) ? true : false;
    }

    // 홀수인지 판별하는 함수
    static boolean checkOdd(int num) {
        return (num % 2 == 1) ? true : false;
    }

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 15;

        System.out.println("add : " + add(num1, num2));
        System.out.println("sub : " + sub(num1, num2));
        System.out.println("mul : " + mul(num1, num2));
        System.out.println("div : " + div(num1, num2));
        System.out.println("Even num1 : " + checkEven(num1));
        System.out.println("Even num2 : " + checkEven(num2));
        System.out.println("Odd num1 : " + checkOdd(num1));
        System.out.println("Odd num2 : " + checkOdd(num2));
    }
}
