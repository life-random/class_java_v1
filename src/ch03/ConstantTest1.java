package ch03;

public class ConstantTest1 {
    public static void main(String[] args) {
        int num = 10;
        num = 101;

        // 상수 사용해 보기
        // final 키워드를 사용하고 변수명에 이름을 작성할 때 배문자 _(언더바)를 사용하는게 권장사항이다
        final int MAX_NUM = 100; // 한 번 값이 정해지면 다시 변경할 수 없다. (상수)
        // MAX_NUM = 1;

        // 원주율을 상수로 선언해 보자.
        final double PI = 3.14159;
        final int RADIUS = 5;

        // 원의 둘레를 구하는 공식(원의 지름 * pi)
        double perimiter = 2 * RADIUS * PI;
        System.out.println("원의 둘레 : " + perimiter);

        // 원의 면적를 구하는 공식(원의 반지름의 제곱 * pi)
        double circleArea = RADIUS * RADIUS * PI;
        System.out.println("원의 면적 : " + circleArea);


    } // end of main

} // end of class

