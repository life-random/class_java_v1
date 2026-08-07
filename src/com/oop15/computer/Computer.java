package com.oop15.computer;

public class Computer {

    private String name;

    private CPU cpu;

    public Computer(String name) {
        this.name = name;
        this.cpu = new CPU("intel Core i5-11400T");
    }

    public void program(){
        System.out.println(name + "가 명령을 받았습니다");
        cpu.work();
    }
}
