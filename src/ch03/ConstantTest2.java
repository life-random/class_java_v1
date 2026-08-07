package ch03;

public class ConstantTest2 {
    public static void main(String[] args) {
        // 도전 과제 - 스스로 상수를 사용해서 값을 화면에 출력해 보세요
        final int HOUR = 24;
        final int MINUTE = 60;
        final int SECOND = 60;

        System.out.println("하루는 " + HOUR + "시간이고, "
                + MINUTE * HOUR + "분이며,"
                + MINUTE * HOUR * SECOND + "초입니다");


    } // end of main

} // end of class

