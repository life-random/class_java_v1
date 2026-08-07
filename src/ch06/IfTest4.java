package ch06;

import java.util.Scanner;

public class IfTest4 {
    public static void main(String[] args) {
        // 키보드에서 값을 받을 도구 준비
        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력하세요:");
        int score = sc.nextInt();
        char grade;
        System.out.println("score : " + score);

        // 조건문을 사용해서 입력 받은 갓에 따라 학점을 출력하는 프로그램을 만들어내자
        // 문제
        // 사용자가 값을 잘못 입렬가흔 경우 방엊거 코드를 잘 작성해주어야 한다
        // 0 ~ 100 점 사이값만 받을 예정이다
        if (score > 100 || score < 0) { // 방어적 코드 작성
            System.out.println("잘못된 입력입니다. 다시 프로그램을 실행 시켜주세요");
            return; // 실행의 제어권을 반납한다
        }

        if (score >= 90) { // 90점 이상, A출력
            grade = 'A';
        } else if (score >= 80) { // 80점 이상, B출력
            grade = 'B';
        } else if (score >= 70) { // 70점 이상, C출력\
            grade = 'C';
        } else if (score >= 60) { // 60점 이상, D출력
            grade = 'D';
        } else {// 90점 미만, F출력
            grade = 'F';
        }
        // 당신의 학점은 A입니다
        System.out.println("당신의 학점은 " + grade + " 입니다");
        sc.close();
    } // end of main

} // end of class
