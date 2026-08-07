package com.oop7;

import java.util.Scanner;

public class GoingToSchoolMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int EAT = 1;
        final int BUS = 2;
        final int SUBWAY = 3;
        final int MY_INFO = 4;
        final int END = 5;

        System.out.println("학생 이름을 입력하세요 : ");
        String name = sc.nextLine();

        Student student = new Student(name, 5000);
        Rice rice = new Rice("김치볶음밥", 3000);
        Bus bus133 = new Bus(133, 1000);
        Subway line1 = new Subway(1, 1400);

        while (true) {
            System.out.println();
            System.out.println("\n 메뉴 선택");
            System.out.println("1. 밥먹기 2.버스타기 3. 지하철타기 4. 내상태 5. 종료");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == EAT){
                student.eat(rice);

            } else if (choice == BUS){
                student.takeBus(bus133);

            } else if (choice == SUBWAY){
                student.takeSubway(line1);

            } else if (choice == MY_INFO){
                student.showInfo();

            } else if (choice == END){
                System.out.println("시스템을 종료합니다");
                break;

            } else {
                System.out.println("잘못된 입력입니다");

            }
        }

        sc.close();
    }
}
