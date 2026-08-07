package com.oop4;

public class CoffeeMachineTest {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine(1000, 20);

        String result = machine.makeCoffee();
        machine.showInfo();
        machine.refillWater(100);
        machine.refillCoffeeBeans(50);
        machine.makeCoffee();
        machine.makeCoffee();
        machine.makeCoffee();
        machine.countCoffee();

    } // end of main
} // end of class
