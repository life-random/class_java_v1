package com.oop1;


// 학생 클래스에 대한 클래스를 먼저 설계해 보자.
// 클래스란 객체를 만들기 전 설계도면이다
public class Student {

    String name;
    int grade;
    double height;
    double weight;


    public void Student(String name, int grade){
        this.name = name;
        this.grade = grade;

        System.out.printf("반갑습니다 %s님, 당신은 %d학년 입니다", this.name, this.grade);
    }

} // end of class

// 컴파일 시점 : 코드를 작성하고 javac 명령어를 실행하는 시점까지
// 런타임 시점 : java 명령어를 통해 프로그램 실행 시점부터 종료시점까지