package com.oop12;

public class Phone {
    private String name;
    private String phoneNumber;

    public Phone(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void showInfo(){
        System.out.println(">>> 전화번호 <<<");
        System.out.println("이름 : " + name);
        System.out.println("번호 : " + phoneNumber);
    }
}
