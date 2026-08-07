package com.oop4;

// 코드를 실행 하는 측 파일
public class MainTest1 {

    // 코드의 시작점
    public static void main(String[] args) {
        //Student s2 = new Student(); // 기본 생성자를 사용해서 객체 생성됨
        // 주의! 만약 단 하나라도 사용자 정의 생성자를 만들었다면 기본 생성자는 제공되지 않음


         Student s1 = new Student(1, "홍길동", 2);
         // s1.id = 1;
         // s1.name = "홍길동";
         // s1.grade = 2;
         // 위 3줄에 명령어를 생성자를 총해서 한 번에 할 수 있다
         // 생성자 - 객체를 생성시키는 특별한 유형에 함수
         s1.showInfo();

    } // end of main
} // end of class
