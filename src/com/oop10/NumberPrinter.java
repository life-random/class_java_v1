package com.oop10;

public class NumberPrinter {
    
    int id;
    static int waitNumber; // 대기 번호
    // 인스턴스(객체)들이 공유할 수 있는 메모리 영역이다.

    public NumberPrinter(int id) {
        this.id = id;
        waitNumber = 1;
    }

    // 번호표 출력 기능
    public void printWaiNumber() {
        System.out.println(id + "기기의 " + "대기 순번은 : " + waitNumber);
        waitNumber++;
    }

}
