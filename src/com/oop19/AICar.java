package com.oop19;

public class AICar extends Car {
    @Override
    protected void drive() {
        System.out.println("자율 주행 합니다. 또는 스스로 방향을 전환 합니다");
    }

    @Override
    protected void stop() {
        System.out.println("목적지에 도착하서 정지합니다");
    }

     // run()은 재정의 불가
    //run()

}
