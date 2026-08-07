package com.oop3;

// 버스 클래스 설계
// 속성과 행위를 설계
// BusMainTest1 (객체를 2개 이상 생성하고 결과 출력 해보기)
public class Bus {

    // 필드
    String busNumber = "54"; // 버스 번호
    String driverName = "홍길동"; // 버스기사 이름
    int PassengersNumber = 0; // 현재 탑승객 수
    final int maxPassengers = 50; // 최대 탑승객 수

    // 메서드
    void stop() {
        System.out.println(busNumber + "번 버스가 정차합니다");
    }

    void checkedDriver(){
        System.out.printf("현재 %s 버스는 %s이(가) 운행 중입니다\n", busNumber, driverName);
    }

    void startBus(){
        System.out.println(busNumber + "번 버스를 다시 운행합니다");
    }

    void TakeBus(int peopleNum){
        System.out.println(peopleNum + "명이 버스에 승차했습니다");
        if (maxPassengers < PassengersNumber){
            System.out.println("현재 버스는 만차 입니다");
            peopleNum = maxPassengers;
        }
        System.out.printf("현재 버스에는 %d명이 탑승하고 있습니다\n", peopleNum);
    }

    void getOffBus(int peopleNum){
        if (PassengersNumber - peopleNum  < 0){
            System.out.println("하차 인원이 잘못되었습니다");
        }
        System.out.println(peopleNum + "명이 하차합니다");
        System.out.printf("현재 버스에는 %d명이 탑승하고 있습니다\n", peopleNum);
    }
}
