package ch02;

/**
 * 문자 데이터 타입
 * char 자료형 크기는 2byte입니다
 */
public class DataType2 {
    // 메인 함수
    public static void main(String[] args) {

        // 기본 자료형 = 문자타입(사실은 정수형으로 저장되어 있다)
        // 문자를 저장할 때 사용한다
        // 단 하나만의 문자를 저장할 수 있다
        char charBox = '가';
        // char charBox2 = '가나'; <-- [][][][][][][][] [][][][][][][][]
        System.out.println(charBox);

        System.out.println('A');
        System.out.println('B');
        System.out.println('C');


        System.out.println("-------------");
        char alphabetA = 'A';
        System.out.println((int)alphabetA);
        System.out.println((int)'K');
        // char alphabetB = "B"; " "(쌍따옴표)는 문자가 아닌 문자열 표현할 때 사용한다.

        // 고민! - 문자도 사실 정수혀이라고 했으나 왜 화면에는 문자 형태로 출력이 되는걸까?
        // 이유는 문자효가 이미 컴퓨터 내부에 저장되어 있다.

    } // end of main

} // end of class
