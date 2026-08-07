package com.oop11;

public class ArrayTest4 {
    public static void main(String[] args) {

        // 문자열 사용 방법
        String  s1 = "안녕";
        String s2 = new String("안녕");

        // 문자열로 배열을 선언해보자.

        String[] names = new String[10];

        // 인덱스 연산자를 이용한 초기화
        names[0] = "김씨";
        names[1] = "나씨";
        names[2] = "박씨";
        names[9] = "최씨";

        // 배열에 길이와 요소의 개수는 동일하지 않다.
        // null 값
        for (int i = 0; i < names.length; i++) {
            // 만약 null이 아니라면 출력
            if (names[i] != null)
                System.out.println(names[i]);
        }
    } // end of main
} // end of class
