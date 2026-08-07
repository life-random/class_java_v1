package com.oop20.remote_control;

public class SmartPhone implements RemoteControl, Chargeable{

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("스마트폰의 화면을 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트폰의 화면을 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("스마트폰의 볼륨을 " + this.volume + "으로 설정합니다");
    }

    @Override
    public void charge() {
        System.out.println("스마트폰을 충전 합니다");
    }
}
