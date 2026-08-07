package com.oop20.test;

public class Americano extends Beverage{
    public Americano(String name, int price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        System.out.println("에스프레소에 물을 붓습니다.");
    }
}
