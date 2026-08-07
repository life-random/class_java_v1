package com.oop7;

public class Student {

    // 필드
    private String name;
    private int money;

    // 생성자


    public Student(String n, int m) {
        name = n;
        money = m;
    }

    // 메소드
    /**
     * eat 메소드
     * @param rice
     * 식사할 메뉴 Rice 객체 매개변수로 선정한다
     * Rice의 sale 메소드를 불러와서 식사의 성공여부에 따라
     * 출력하는 메시지가 달라진다
     */
    void eat(Rice rice) {
        if(rice.sale(money)){
            money -= rice.getPrice();
            System.out.println(rice.getMenu() + "를 먹었습니다");
        } else {
            System.out.println(rice.getMenu() + "를 먹기에는 소지금액이 부족합니다");
        }
    }

    void takeBus(Bus bus) {
        if(bus.take(money)){
            money -= bus.getPrice();
            System.out.println(bus.getNumber() + "번 버스에 탑승하셨습니다");
        } else {
            System.out.println("버스 요금이 부족합니다");
        }
    }

    void takeSubway(Subway subway ) {
        if(subway.take(money)){
            money -= subway.getPrice();
            System.out.println(subway.getline() + "호선 지하철에 탑승하셨습니다");
        } else {
            System.out.println("버스 요금이 부족합니다");
        }
    }

    void showInfo() {
        System.out.println("-----스테이터스-----");
        System.out.println("학생 이름 : " + name);
        System.out.println("소지 금액 : " + money);
    }
}
