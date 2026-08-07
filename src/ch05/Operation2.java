package ch05;

public class Operation2 {

    // 메인 함수
    public static void main(String[] args) {

        System.out.println(5 + 3);
        System.out.println(5 - 3);
        System.out.println(5 * 3);
        System.out.println((double) 5 / 3); // (1.66666) -> int / int => int 소수점을 버림
        System.out.println(5 % 3);

        // 문제
        // 1. (12 + 3) / 3을 화면에 출력해보세요 , 단 결과값을 변수에 담아서 출력
        double result = (12 + 3) / 3;
        System.out.println("(12 + 3) / 3 = " + result);

        // 2. (25 % 2) 값을 화면에 출력해보세요
        int result2 = 25 % 2;
        System.out.println("25 % 2 = " + result2);
        // 나머지 연산자는 해당하는 값이 짝수인지 홀수인지 판별할 때 유용하다
        // 어떤 수로 2로 나누었을 때 나머지가 0 짝수라고 판별이되고 1이면 홀수라고 판별할 수 있다

        //3. 7896456 값이 홀수 인지 짝수인지 화면에 1 또는 0으로 표시하는 코드를 출력하세요
        int result3 = 7896456 % 2; // 0이면 짝수로 판단할 수 있다
        System.out.printf("%d %% %d = %d 이므로 짝수이다 %n", 7896456, 2, result3);


    } // end of main

} // end of class
