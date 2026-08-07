package com.oop20.test2;

public class Manager extends FullTimeEmployee{
    private int allowance;

    public Manager(String name, int id, int monthlySalary, int allowance) {
        super(name, id, monthlySalary);
        this.allowance = allowance;
    }

    public int calculatePay() {
        return super.calculatePay();
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("직책 수당 : " + allowance + "원");
        System.out.println("급여 : " + (calculatePay() + allowance) + "원");
        System.out.println("보너스 : " + calculateBonus()  + "원");
    }
}
