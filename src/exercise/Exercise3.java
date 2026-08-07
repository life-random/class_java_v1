package exercise;

public class Exercise3 {

    // 메인 코드
    public static void main(String[] args) {
        // 할인 된 가격을 화면에 출력 하는 코드 작성

        final double ORIGINAL_PRICE = 59.99;
        final double DISCOUNT_RATE = 0.30; // 30 % 할인
        // ORIGINAL_PRICE와 DISCOUNT_RATE는 언제든 달라질 수 있다

        // 할인 계산식 찾아서 준비
        // 원가 * ((100 - 할인률) / 100)
        // 할인된 계산 금액을 변수에 담아서 화면에 출력 (단, 정수값으로 출력하시오)
        double result = ORIGINAL_PRICE * (1 - DISCOUNT_RATE);
        System.out.println("할인된 가격 : " + result + "$");
    } // end of main

} // end of class
