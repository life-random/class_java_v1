package useful.ch03;

public class StringTest1 {
    public static void main(String[] args) {

        String s1 = "aaa";
        String s2 = "aaa";
        String s3 = new String("aaa");
        String s4 = new String("aaa");

        System.out.println("s1 == S2 : " + (s1 == s2));
        System.out.println("s3 == S4 : " + (s3 == s4));
        System.out.println("s3.euals(s1) : " + s3.equals(s1));

        // == 는 주소값(참조) 비교
        // Object의 equals() 기본 동작은 주소값 비교 이지만,
        // String의 quals()는 내부적으로 재정의 되어 있어 "문자열 내용"을 비교 한다
        // 즉, 논리적 동등성을 비교함
        //결론 : 문자열 논리적으로 비교할 때 무조건 == equals()를 사용해야 한다.

        s1 += "a";
        System.out.println(s1);

    } // end of main
} // end of class
