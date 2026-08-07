package com.oop20.test2;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("홍길동", 1001, 3000000);
        Employee partTime = new PartTimeEmployee("이문세", 2002, 11800, 4);
        Employee manager = new Manager("김정환", 3003, 4000000, 500000);

        fullTime.printInfo();
        System.out.println("월급 : " + fullTime.calculatePay() + "원");
        System.out.println("---------------------");

        partTime.printInfo();
        System.out.println("---------------------");

        manager.printInfo();
    }
}
