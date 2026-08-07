package com.oop20.test;

import org.w3c.dom.ls.LSOutput;

public class BeverageTest {
    public static void main(String[] args) {
        Beverage[] beverages = new Beverage[2];
        beverages[0] = new Americano("아메리카노", 3000);
        beverages[1] = new Ratte("라떼", 4500);
        int sum = 0;

        for (int i = 0; i < beverages.length; i++) {
            beverages[i].prepare();
            beverages[i].serve();
            System.out.println("---------------");
        }
        System.out.print("주문 : ");
        for (int i = 0; i < beverages.length; i++) {
            System.out.print(beverages[i].getName());
            if (beverages.length-1 != i){
                System.out.print(", ");
            }
            sum += beverages[i].getPrice();
        }
        System.out.println();
        System.out.println("총 금액 : " + sum + "원");


    }
}
