package com.oop17;

public class Apple extends Fruit{

    public Apple() {
        name = "사과";
        price = 3000;
    }

    // 정액 할인 = 고정값 천원만 빼기
    // 정율 할인 - 10%를 깍는다
    public void sale(){
        int discount = price / 10;
        price -= discount;
        System.out.println("사과 10% 할인. 현재 가격 : " + price);
    }
}
