package com.oop14.hero;

public class Warrior extends Hero{

    public Warrior(String name, int hp) {
        super(name, hp);
        // 부모 클랫의 사용자 정의 생성자가 있다면 반드시 부모 생성자를 호출해야 사용할 수 있다.
    }

    void comboArrack() {
        System.out.println(name + "이(가) 콤보 공격을 합니다");
    }
}
