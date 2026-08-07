package ch05;

/**
 * 복합 대입 연산자
 * 대입 연산자와 다른 연산자가 함께 쓰이는 것
 */
public class Operation3 {

    // 메인 함수
    public static void main(String[] args) {
        int n1 = 100;
        n1 = n1 + 1;
        n1 = n1 + 1; // 원래 있는 값에 +1씩 더해주고 있다
        n1 = n1 + 1; // 간소화 하기 위해서 복합 대입 연산자를 활용할 수 있다.
        System.out.println("--------------------------------------------------");

        // 시작값 설정
        int score = 0;

        // 1. 점수 추가
        // score = score + 5;
        score += 5; // 복합 대입 연산자
        System.out.println("농구 점수 5점 추가 " + score);

        // 2. 점수 감점
        // score = score - 1;
        score -= 1;
        System.out.println("농구 점수 1점 감점 " + score);

        // 3. 점수 네배 증가
        // score = score * 4;
        score *= 4;
        System.out.println("농구 점수 4배 증가 " + score);

        // 4. 점수 2배 감소
        // score = score / 2;
        score /= 2;
        System.out.println("농구 점수 2배 감소 " + score);

        // 5. 점수 3의 나머지
        // score = score % 3;
        score %= 3;
        System.out.println("농구 점수 3의 나머지 " + score);

    } //end of main

} // end of class
