package com.oop7;

public class Bus {
    // 필드
    private int number;
    private int price;

    // 생성자
    public Bus(int n, int p) {
        number = n;
        price = p;
    }

    // 메소드
    boolean take(int wallet) {
        if (wallet >= price)
            return true;
        else
            return false;
    }

    int getNumber() {
        return number;
    }

    int getPrice(){
        return price;
    }
}
