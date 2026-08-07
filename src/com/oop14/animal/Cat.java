package com.oop14.animal;

public class Cat extends Animal {
    @Override
    void eat() {
        super.eat();
        System.out.println("고양이가 밥을 먹는다");
    }
}
