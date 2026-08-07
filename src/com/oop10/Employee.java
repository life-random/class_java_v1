package com.oop10;

public class Employee {


     int employeeNumber; // 고유 사원 번호
    private String name;
    private String department;

    // 문제 상황 - 직원 객체를 생성할 때 마다 자동으로
    // Company 의 시리얼 번호르 활용해서 1001, 직원이 생성이 되면 1002 ...
    // 자동으로 할당할 수 있도록 코들르 완성해주세요
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
        employeeNumber = Company.empSerialNumber++;
    }
}
