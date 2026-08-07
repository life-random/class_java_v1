package ch08;

import java.util.Scanner;

public class MenuChoice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 스캐너 활용 - 문자열로 값 받기(키보드에서)
        int menuNumber = scanner.nextInt();
        // nextInt는 정수값만 가지고 가고 개행 문자를 남겨 둔다
        scanner.next(); // 개행 문자 소비
        String name = scanner.nextLine(); // 문자열 받기

        System.out.println("menuNumber : " + menuNumber);
        System.out.println("name : " + name);

    } // end of main
} // end of class