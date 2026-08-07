package com.oop20.test;

public class Ratte extends Beverage{
    public Ratte(String name, int price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        System.out.println("에스프레소에 우유을 붓습니다.");
    }
}
