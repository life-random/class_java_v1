package com.oop7;

public class Subway {
    // 필드
    private int line;
    private  int price;

    // 생성자
    public Subway(int l, int p) {
        line = l;
        price = p;
    }

    // 메소드
    boolean take(int wallet) {
        if (wallet >= price)
            return true;
        else
            return false;
    }

    int getline() {
        return line;
    }

    int getPrice(){
        return price;
    }
}
