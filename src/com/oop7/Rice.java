package com.oop7;

public class Rice {
    // 필드
    private String menu;
    private int price;

    // 생성자

    public Rice(String m, int p) {
        menu = m;
        price = p;
    }

    // 메소드
    /**
     * 지갑과 메뉴 가격를 비교하는 메소드
     * @param wallet 학생이 소지하고 있는 금액
     * @return 지갑의 금액이 더 크면 true, 아니면 false를 return
     */
    boolean sale(int wallet){
        if (wallet >= price)
            return true;
        else
            return false;
    }

    String getMenu(){
        return menu;
    }

    int getPrice(){
        return price;
    }
}
