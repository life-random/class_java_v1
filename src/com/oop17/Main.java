package com.oop17;

public class Main  {
    public static void main(String[] args) {

        Fruit[] fruits = new Fruit[3];
        fruits[0] = new Banana();
        fruits[1] = new Peach();
        fruits[2] = new Apple();

        // 타입 검사가 필요 없음
        //새로운 과일 타입이 추가되더라더 새로운 if - else문을 작성할 이유가 없다

        for (int i = 0; i < fruits.length; i++) {
            fruits[i].showInfo();
             fruits[i].sale();
            System.out.println("----------------------");
        }
    }
}
