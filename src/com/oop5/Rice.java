package com.oop5;

public class Rice {

    String menu;
    int amount;

    public Rice(String m, int a) {
        menu = m;
        amount = a;
    }

// 먹은 만큼 줄어든다. 성공하면 true, 실패하면 false 반환 리턴 값 설계
    boolean reduce(int a){
        if (amount >= a){
            amount -= a;
            return true;
        } else {
            return false;
        }
    }

    //showInfo
    void showInfo() {
        System.out.printf("%s의 남은 양 : %d\n", menu, amount);
    }
}
