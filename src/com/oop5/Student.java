package com.oop5;

public class Student {

    String name;
    int money;
    int stemina;
    public Student(String n, int m) {
        name = n;
        money = m;
    }

    // 메서드 1. 학생이 버스를 탄다
    void takeBus(Bus bus){
        // 자기에 일을 직접 스스로 해결 한다
        bus.take(Bus.cost);
        money -= Bus.cost;
    }

    void takeSubway(Subway subway){
        // 자기에 일을 직접 스스로 해결 한다
        subway.take(Subway.cost);
        money -= Subway.cost;
    }

    // 메서드 2. 정보창 보여 주는 기능
    void showInfo() {
        System.out.println(name + "님의 현재 남은 금액 : " + money);
        System.out.println(name + "님의 현재 기력 : " + stemina);
    }

    // 메서드 3. 학생이 밥을 먹는다. (남은 양이 없으면 밥을 못 먹었습니다)
    void eat(Rice rice, int amount){
        if (rice.reduce(amount)){
            stemina += amount;
            System.out.printf("%s는 %s을(를) %d 만큼 먹었다!\n", name, rice.menu, amount);
            System.out.printf("%s의 기력이 %d 만큼 회복되었다!\n", name, amount);
        } else {
            System.out.printf("%s는 %s이(가) 원하는 양보다 적어서 먹는 것을 포기했다...\n", name, rice.menu);
        }
    }
}
