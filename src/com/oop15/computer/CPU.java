package com.oop15.computer;

public class CPU {
    private String name;

    public CPU(String name) {
        this.name = name;
    }

    public void work(){
        System.out.println(name + "이 연산 중 입니다");
    }
}
