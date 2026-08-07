package useful.ch02;

/**
 * substring(int beginIndex) 시작 인데스
 * substring(int beginIndex, int endIndex) 시작 인데스, 끝 인덱스
 *
 * 개념 정리 - substring 은 문자열의 일부 구간을 잘라내여 새로운 문자열로 반환하는 메서드입니다
 */
public class SubstringMain {
    public static void main(String[] args) {

        // H e l l o W o r l d
        // 0 1 2 3 4 5 6 7 8 9
        String text = "HelloWorld";

        // 1. 시작 위치부터 끝까지 자르기
        System.out.println("substring(5) : " + text.substring(5));
        // 2. 시작 위치부터 끝 위치 '앞'까지
        System.out.println("substring(0, 5) : " + text.substring(0, 5));
        // 3. 만들어져 있는 모야 맞추기 개념 확인

        // 시작인덱스 포함, 끝 인덱스는 포함 안함
        System.out.println("substring(2, 6) : " + text.substring(2, 6));

        // 주의할 점
        // 인덱스 값의 범위를 벗어나지 않도록 해야함

        String str = "abcde";
        String sub = str.substring(2);
        System.out.println("sub : " + sub); // cde

        String sub2 = str.substring(1, 3);
        System.out.println("sub2 : " + sub2); // bc
    }
}
