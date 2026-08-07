package com.oop5;

public class Bus {

    int busNumber;
    int count; //
    int money; //
    static int cost;
    // 멤버 변수를 생성자를 통해서 초기화 하지 않는다면 자동으로 기본값을 가지게 된다

    public Bus(int number){
        busNumber = number;
        cost = 1000;
    }

    // 사람을 태우다
    void take(int pay){
        money += pay;
        count++;
    }

    // 현재 버스의 상태를 보여주는 메소드
    void showInfo(){
        System.out.printf("-----%d번 버스 스테이터스-----\n", busNumber);
        System.out.println("현재 승객 수 : " + count);
        System.out.println("현재 수익 금액 : " + money);
    }


}
