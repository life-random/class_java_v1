package com.oop14.hero;

public class Wizard extends Hero{
    public Wizard(String name, int hp) {
        super(name, hp);
    }

    void freezing(){
        System.out.println(name + "이(가) 얼음마법으로 적을 얼립니다");
    }
}
