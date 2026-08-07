package com.oop16.animal;

public class AnimalTest1 {
    public static void main(String[] args) {

        // 1. 자기 타입으로 바라보기
        Animal animal1 = new Animal();
        animal1.move();
        animal1.eating();
        System.out.println("-------------------------");

        // 2. 부모 타입으로 자식 객체 바라보기 (업캐스팅)
        Animal animal2 = (Animal) new Tiger(); // 업캐스팅된 상태 - 생략 가능
        animal2.move();
        animal2.eating();
        // 3. 다운캐스트 작성해보기
        Tiger tiger = (Tiger) animal2; // 강제 형 변환
        tiger.hunting(); // Tiger 타입의 메서드를 호출 할 수 있다.


        System.out.println("-------------------------");
        // 2.1 부모 타입으로 자식 객체 바라보기(업캐스팅)
        Animal animal3 = (Animal) new Homan(); // 업개스팅된 상태 (생략 가능)
        animal3.move();
        animal3.eating();

        // 3. 문제 확인
        // Human 객체에는 readBook() 메서드가 호출 될까?
        // animal3.readBook() <-- 에러 발생 : 실제 객체 Human이 맞지만
        // 컴파일 시점에 readBook()을 호출할 수 없음

        // 핵심 - 컴파일 시점에는 타입만 바라보고
        // 런 타임 시점에는 실제 동작한는 객체에 행위가 실행된다.

    } // end of main
} // end of class
