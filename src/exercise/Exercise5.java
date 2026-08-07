package exercise;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        // 요구사항을 확인하고 프로그램을 작성하시오
        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력해주세요 :");
        int score = sc.nextInt();

        if (score > 100 || score < 0){
            System.out.println("잘못된 입력입니다. 성적은 0에서 100 사이로 입력해주세요");
        } else if (score >= 90) {
            System.out.println("당신은 A학점입니다");
            System.out.println("우수한 성적이네요! 계속 좋은 성적 유지하길 바랍니다.");
        } else if (score >= 80) {
            System.out.println("당신은 B학점입니다");
            System.out.println("좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!");
        } else if (score >= 70) {
            System.out.println("당신은 C학점입니다");
            System.out.println("괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다");
        } else if (score >= 60) {
            System.out.println("당신은 D학점입니다");
            System.out.println("학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.");
        } else {
            System.out.println("당신은 F학점입니다");
            System.out.println("불합격입니다. 부족한 부분을 파악하고, 추가 학습이 필요해요");
        }

        sc.close();
    } // end of main

} // end of class
