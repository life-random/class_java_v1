package com.oop14.cal;

public class Cal {

    public int sum(int n1, int n2){
        return n1 + n2;
    }

    public int multiply(int n1, int n2){
        return n1 * n2;
    }
} // end of class

// xxx.java 하나의 자바 파일에 여러 개의 클래스를 선언할 수는 있지만 권장하지 않는다.
// 주의점 : 단 하나의 자바 파일에는 오직 public 클래스는 하나만 선언할 수 있다. // 문법 약속

class ChildCal extends Cal{

    public int minus(int n1, int n2){
        return n1 - n2;
    }

    @Override // 어노테이션 (컴파일러에게 알려주는 주석)
    // 부모 클래스의 메서드를 재 정의할 수 있다. --> 오버 라이드 한다 (상속 관계에서만 사용)
    public int multiply(int n1, int n2){
        System.out.println("Chaild의 multiply() 호출");
        if (n1 == 0 || n2 == 0){
            System.out.println("0으로 입력하지 마세요");
        }
        return n1 * n2;
    }

} // end of class
