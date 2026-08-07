package com.oop5;

public class GoingToSchool {
    public static void main(String[] args) {
        Bus bus133 = new Bus(133);
        Bus bus57 = new Bus(57);
        Subway subway1 = new Subway(1);
        Subway subway2 = new Subway(2);
        Rice multigrain = new Rice("잡곡밥 ", 100);
        Rice rice = new Rice("쌀밥", 50);
        Rice curry = new Rice("카레", 200);
        Student studentKim = new Student("홍길동", 10000);
        Student studentLee = new Student("이순신", 5000);
        Student studentJeon = new Student("전우치", 3000);

        studentKim.takeBus(bus133);
        studentLee.takeBus(bus133);
        studentJeon.takeSubway(subway1);

        studentKim.eat(multigrain, 30);
        studentLee.eat(multigrain, 50);
        studentJeon.eat(rice, 70);
        studentJeon.eat(curry, 110);

        studentLee.showInfo(); // Lee 현재 소지금 확인
        studentKim.showInfo(); // Kim 현재 소지금 확인
        studentJeon.showInfo();
        bus133.showInfo();
        multigrain.showInfo();
        rice.showInfo();
    }
}
