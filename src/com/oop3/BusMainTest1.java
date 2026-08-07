package com.oop3;

public class BusMainTest1 {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        bus1.checkedDriver();
        bus1.stop();
        bus1.TakeBus(30);
        bus1.startBus();
        bus1.stop();
        bus1.getOffBus(15);
        bus1.TakeBus(10);
        bus1.startBus();

    } // end of main
} // end of class
