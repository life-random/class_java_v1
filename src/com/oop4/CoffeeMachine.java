package com.oop4;

public class CoffeeMachine {

    // 커피머신의 상태(필드) : 물의 양(ml), 커피 원두 양(g)
    int water;
    int coffeeBeans;
    int count = 0; // 커피를 내린 횟수


    // 생성자 직접 설계해서 테스트 코드 작성해보기
    public CoffeeMachine(int wat, int beans) {
        water = wat;
        coffeeBeans = beans;
    }

    // 메서드 1. 물 채우기
    void refillWater(int amount) {
        if (amount > 0) {
            water += amount;
            System.out.println(amount + "ml 물을 채웠습니다");
        } else {
            System.out.println("0보다 더 많은 양의 물을 채워주세요");
        }

    }

    // 메서드 2. 원두 채우기
    void refillCoffeeBeans(int amount) {
        if (amount > 0) {
            coffeeBeans += amount;
            System.out.println(amount + "g의 커피 원두를 채웠습니다");
        } else {
            System.out.println("0보다 더 많은 양의 커피 원두를 채워주세요");
        }
    }

    // 메서드 3. 커피 만들기
    String makeCoffee() {
        // 커피 한 잔에 물 100ml, 원두 10g 필요
        if (water >= 100 && coffeeBeans >= 10) {
            water -= 100;
            coffeeBeans -= 10;
            count++;
            return "맛있는 커피를 만들었습니다!";
        } else {
            return "재료가 부족합니다! 물이나 원두를 채워주세요";
        }
    }

    // 메서드 4. 해당하는 객체의 현재 상태 값을 보여주는 기능 추가
    void showInfo(){
        System.out.println("-----상태창-----");
        System.out.printf("물 %dml, 원두 %dg이 있습니다\n", water, coffeeBeans);
    }

    // 현재 해당하는 커피 머신이 몇 잔의 커피를 만들었는 지 출력하는 기능을 만들어 주세요
    void countCoffee(){
        System.out.printf("현재까지 커피를 %d잔 내렸습니다\n", count);
    }
}
