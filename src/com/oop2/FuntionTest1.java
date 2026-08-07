package com.oop2;

public class FuntionTest1 {

    // 1. 함수을 설계해 보자
    // 두 개의 정수 값을 인풋값으로 받아서 덧셈을 하고 그 결과를 반환하는 이련에 작업 묶음.
    static int add(int n1, int n2){
        int result = n1 + n2;
        // return <== 값을 반환한다.
        return result;
    }

    // 2. 함수 사용하기 (모양 맞추기)
    // 코드 실행의 시작점 (메인 함수)
    public static void main(String[] args) {
        System.out.println("내가 설계한 함수를 사용해 보자");
        // 함수 이름 호출 그리고 모양 맞추기
        int result1 = add(5, 10);
        System.out.println("result1 : " + result1);
        int result2 = add(7, 12);
        System.out.println("result2 : " + result2);
    }

} // end of class
