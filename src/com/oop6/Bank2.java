package com.oop6;

public class Bank2 {
    // 접근 제어 지시자 활용
    // 멤버 변수를 선언할 때 기본값 private 사용하기

    private String name;
    private int balance;
    private String acconuntNumber;

    public void deposit(int money) {
        balance += money;
        System.out.println("입금 완료");
    }

    // 출금하다
    public int withdraw(int money) {
        if (balance >= money) {
            balance -= money;
            return money;
        } else {
            System.out.println("잔액 부족");
            return 0;
        }
    }
    // 현재 잔액 표시
    public void showInfo(){
        System.out.println("현재 잔액 : " + balance + "원");
    }
}
