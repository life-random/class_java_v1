package ch08;

public class ContinueTest3 {
    public static void main(String[] args) {

        //369 게임! 1부터 30까지 세되,
        // 3, 6, 9 들어간 숫자는 "짝!" 이라고 외칩니다1

        for (int i = 1; i <= 30; i++) {
            int last = i % 10;
            int last2 = i / 10;
            if (last == 3 || last == 7 || last == 9 ||
                    last2 == 3 || last2 == 7 || last2 == 9) {
                System.out.println("짝!");
                continue;
            }
            System.out.println(i);
        }

        // 샘플 테스크 코드
        // 나머지 연산자와 10이라는 숫자를 활용하면 끝자리를 추출할 수 있다
//        System.out.println(23 % 10);

    } // end of main

} // end of class
