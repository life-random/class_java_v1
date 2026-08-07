package com.oop18.computer;


public class DeskTop extends Computer {
    @Override
    public void display() {
        System.out.println("모니터를 이용하여 화면를 봅니다");
    }

    @Override
    public void typing() {
        System.out.println("키보드를 이용하여 타자를 칩니다");
    }
}
