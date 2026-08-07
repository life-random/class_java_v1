package ch01; // 패키지 ch01 폴더 안에 존재하는 파일임

// 이 파일은 Variable.java 파일입니다.

/**
 * 변수란 뭘까?
 * 변하는 수 (변할 수 있는 데이터)
 * 데이터(값)를 담을 수 있는 공간(상자)
 */
public class Variable {
     // 프로그램의 시작점
    public static void main(String[] args) {
     // 1. 변수의 선언
        int ageBox; // 변수 값을 담을 수 있는 상자를 선언
        int telBox; // 정수 값을 값을 수 있는 상자를 선언

        // 2. 변수의 값을 대입
        ageBox = 30;

        // 3. 변수에 사용
        System.out.println(ageBox); // 화면에 괄호안에 있는 값을 출력하라

        // 4. 변수는 변할 수 있는 수 이다.
        ageBox = 100;

        // 5. 화면에 다시 변수 출력
        System.out.println(ageBox);

    } // end of main

} // end of class
