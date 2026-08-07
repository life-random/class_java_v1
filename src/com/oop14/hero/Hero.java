package com.oop14.hero;

public class Hero {
    String name;
    int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void attack(){
        System.out.println(name +"이(가) 공격합니다");
    }
}
