package ch03;

/**
 * 형변환이란?
 * 데이터의 타입을 다른 타입으로 변경 하는 것
 * - 자동 형변환, 강제 형변환
 */
public class TypeConversion2 {
    // 코드의 시작점
    public static void main(String[] args) {
        // 자동 형변환 코드 작성해보기
        final int YEAR = 2026;
        double doubleItemBox = YEAR;

        // 강제 형변환 코드 작성해보기
        final double ACTUAR_NUM = 1.23456789;
        int intItemBox = (int) ACTUAR_NUM;

        // 결과 출력해 보기
        System.out.println("자동 형변환 출력 : " + doubleItemBox);
        System.out.println("강제 형변환 출력 : " + intItemBox);

        // 여기서 질문 : 4바이트 짜리 float을 int로 바꾸었다 다시 float로 형변환하면 유지될까?
        float floatNum = 1.2345f;
        int intBox = (int) floatNum;
        System.out.println("int 출력 : " + intBox);
        System.out.println("float 출력 : " + (float) intBox);
        // 결론 : 형변환은 크기가 문제가 아니라 다른 타임이 되면서 값의 손실이 일어난다

    } // end of main

} // end of class
