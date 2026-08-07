package exercise;

public class Exercise1 {

    // 메인 함수(코드 실행에 시작점)
    public static void main(String[] args) {
//        1. 데이터 10, 100, 100 을 변수 선언과 동시에 초기화를 하고 화면에 출력해 보세요.
        int aa = 10;
        int bb = 100;
        int cc = 100;
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);

//        2. int ageBox 상자에 20을 담아 보세요
        int ageBox = 20;

//        2.1 ageBox 상자의 값을 30으로 변경하고 기존에 담겨 있던 데이터를 다른 곳으로 옮겨 보세요
        int temp = ageBox;
        ageBox = 30;

//        3. int a = 1; int b = 3; 선언하고 a와 b에 담겨 있는 값을 서로 스위칭 해보세요
        int a = 1, b = 3;
        int t = a;
        a = b;
        b = t;

    } // end of main

} // end of class
