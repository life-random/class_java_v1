package com.oop19;

public class CarMainTest{

    public static void main(String[] args) {

        Car car1 = new AICar();
        Car car2 = new ManualCar();

        car1.run();
        System.out.println("-----------------");
        car2.run();

    }
}
