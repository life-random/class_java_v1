package com.oop10;

public class Card {
    static int serialNumber = 1111;
    int cardNumber;
    private String name; // 소유자
    private String year; // 유효기간

    public Card(String name, String year) {
        this.name = name;
        this.year = year;
        cardNumber = serialNumber++;
    }

    public void showInfo(){
        System.out.println("소유주 : " + name);
        System.out.println("유효연도 : " + year);
        System.out.println("카드번호 : " + cardNumber);
        System.out.println("-------------------------");
    }
}
