package com.oop4;

public class Bus {

    int busNumber;
    int money;

    public Bus(int n){
        busNumber = n;
    }

    public Bus(int n, int m){
        busNumber = n;
        money = m;
    }

    // 생성자는 여러개 만들 수 있다. (생성자 오버로딩)
}
