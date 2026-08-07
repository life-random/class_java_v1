package com.oop14.customer;

public class Customer {
    private int customerID;
    private String custmerName;
    private String customerGrade;
    private int bonusPoint;
    private double bonusRatio;

    public Customer(int customerID, String custmerName, String customerGrade) {
        this.customerID = customerID;
        this.custmerName = custmerName;
        this.customerGrade = customerGrade;
    }

    public int calcPrice(int price){
        return 0;
    }

    public String showCustomerInfo(){
        return customerID + ", " + custmerName + ", " +customerGrade;
    }
}
