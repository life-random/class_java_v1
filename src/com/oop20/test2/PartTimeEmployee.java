package com.oop20.test2;

public class PartTimeEmployee extends Employee{
    private int hourlyWage;
    private int workHours;

    public PartTimeEmployee(String name, int id, int hourlyWage, int workHours) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.workHours = workHours;
    }

    @Override
    public int calculatePay() {
        return hourlyWage * workHours;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("이번 달 근무시간 : " + hourlyWage + "시간");
        System.out.println("급여 : " + calculatePay() + "원");
    }
}
