package exercise;

public class Exercise8 {

    static void greet(String name) {
        System.out.printf("안녕하세요, %s님!\n", name);
    }

    static int square(int n) {
        return n * n;
    }

    static String signOfNumber(int n) {
        String result = "";
        if (n < 0) {
            result = "positive";
        } else if (n == 0) {
            result = "zero";
        } else if (n > 0) {
            result = "negative";
        }
        return result;
    }

    static Boolean checkAdult(int age) {
        if (age < 18) {
            return false;
        }
        return true;
    }

    static int findMax(int n1, int n2) {
        return (n1 > n2) ? n1 : n2;
    }

    // 코드 실험 부분
    public static void main(String[] args) {
        greet("홍길동");
        System.out.println(square(10));
        System.out.println(signOfNumber(2));
        System.out.println(signOfNumber(0));
        System.out.println(signOfNumber(-2));
        System.out.println(checkAdult(18));
        System.out.println(checkAdult(17));
        System.out.println(findMax(50, 100));
    }

}
