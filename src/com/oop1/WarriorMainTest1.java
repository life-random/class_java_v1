package com.oop1;

public class WarriorMainTest1 {

    // 코드 실행의 진입점(메인 함수) - JVM - Stack(메모리)
    public static void main(String[] args) {
        // new - 키워드, () <-- 생성자 호출
        Warrior w1 = new Warrior();

        w1.name = "티모";
        w1.height = 10.5;
        w1.health = 100;
        w1.attackPower = 70;
        w1.depencePower = 30;

        // w1 참조변수에 접근해서 값을 할당해 보자.
        //객체의 접근은 .연산자로 할 수 있다.
        System.out.println("w1 주소값 : " + w1);
        System.out.println("w1 이름 : " + w1.name);
        System.out.println("w1 키 : " + w1.height);
        System.out.println("w1 체력 : " + w1.health);
        System.out.println("w1 공격력 : " + w1.attackPower);
        System.out.println("w1 방어력 : " + w1.depencePower);

        System.out.println("-------------------------");

        // warrior 타입에 객체를 생성해서 해당 하는 상태값을 입력하고
        // 화면에 출력하시오

        Warrior w2 = new Warrior();

        w2.name = "가렌";
        w2.health = 500;
        w2.height = 180.1;
        w2.attackPower = 100;
        w2.depencePower = 90;

        System.out.println("w2 name : " + w2.name);
        System.out.println("w2 health : " + w2.health);
        System.out.println("w2 height : " + w2.height);
        System.out.println("w2 attackPower : " + w2.attackPower);
        System.out.println("w2 depencePower : " + w2.depencePower);

    } // end of main
} // end of class
