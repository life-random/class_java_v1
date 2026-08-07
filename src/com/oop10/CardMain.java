package com.oop10;

public class CardMain {
    public static void main(String[] args) {

        Card card1 = new Card("홍길동", "08/31");
        Card card2 = new Card("홍길동", "08/32");
        Card card3 = new Card("전몽주", "08/32");
        Card card4 = new Card("유관순", "08/32");
        Card card5 = new Card("홍길동", "08/33");

        card1.showInfo();
        card2.showInfo();
        card3.showInfo();
        card4.showInfo();
        card5.showInfo();
    } // end of main
} // end of class
