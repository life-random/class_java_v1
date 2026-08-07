package com.oop3;

public class StudentGame1 {
    public static void main(String[] args) {

        // 1. 객체 생성 (Heap 메모리에 할당)
        Student s1 = new Student();

        // 2. 참조 변수를 사용해서 객체에 접근하고 값 할당
        s1.studentId = 1;
        s1.studentName = "홍길동";
        s1.address = "조선";

        // 3. 생성된 객체의 동작을 호출
        s1.study();
        s1.breakTime();
        s1.takeExam();
        s1.cleaning();
        s1.showInfo();

        // 중요!
        // 메소드란?
        // 객체의 기능을 구현하기 위해 해당 클래스 내부에 구현되는 함수
        // 메소드는 함수와 다르게 멤버 변수를 활용해서 기능을 구현한다

        System.out.println("------------------------");
        Student s2 = new Student();
        s1.studentId = 2;
        s1.studentName = "이상";
        s1.address = "조선";

        s1.study();
        s1.breakTime();
        s1.takeExam();
        s1.cleaning();
        s1.showInfo();
        System.out.println("------------------------");

    } // end of main
} // end of class
