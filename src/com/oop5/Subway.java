package com.oop5;

public class Subway {
    int LineNumber; // 1, 2 호선
    int count;
    int money;
    static int cost = 500;
    // 1. 생성자

    public Subway(int number) {
        LineNumber = number;
    }

    // 2. 승객을 태운다
    void take(int pay){
        money += pay;
        count++;
    }

    // 3. 정보 보기
    void showInfo(){
        System.out.printf("-----%d호선 철도 스테이터스-----\n", LineNumber);
        System.out.println("현재 승객 수 : " + count);
        System.out.println("현재 수익 금액 : " + money);
    }
}
