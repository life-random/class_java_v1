package com.oop14.customer;

public class GoldCustomer extends Customer{
    private int agentID;
    private double salesRatio;

    public GoldCustomer(int customerID, String custmerName, int agentID) {
        super(customerID, custmerName, "Gold");
        this.agentID = agentID;
    }
}
