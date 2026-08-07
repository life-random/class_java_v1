package com.oop14.customer;

public class VIPCustomer extends Customer{
    private int agentID;
    private double salesRatio;

    public VIPCustomer(int customerID, String custmerName, int agentID) {
        super(customerID, custmerName, "VIP");
        this.agentID = agentID;
    }
}
