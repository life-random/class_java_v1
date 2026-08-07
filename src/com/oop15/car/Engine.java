package com.oop15.car;

public class Engine {

    private String name;

    public Engine(String name){
        this.name = name;
    }

    public void start() {
        System.out.println(name + " 엔진이 가동됩니다");
    }

    public void stop() {
        System.out.println(name + "정지 합니다");
    }
}
