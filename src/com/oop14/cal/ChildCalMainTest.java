package com.oop14.cal;

public class ChildCalMainTest {
    public static void main(String[] args) {

        ChildCal childCal = new ChildCal();

        System.out.println("sum : " + childCal.sum(10, 10));
        System.out.println("mul : " + childCal.multiply(10, 0));
        System.out.println("min : " + childCal.minus(10, 1));

        // 곱하기 기능에 n1, n2에 0이 들어온다면 0을 입력하지 마시오
        // 주의점 : 단 하나의 자바 파일에는 오직  public 클래스는 하나만 선언할 수 있다. // 문법 약속

        // 답) 메서드 오버라이딩 활용
    } // end of main
} // end of class

