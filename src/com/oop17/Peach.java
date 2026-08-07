package com.oop17;

public class Peach extends Fruit{
    // name, price, showInfo 를 부모에게 물려 받았다.
    public Peach(){
        name = "복숭아";
        price = 8000;
    }

    // sale 메서드를 재정의 하지 않으므로,
    // 부모 클래스의 sale 메서드가 실행된다
}
