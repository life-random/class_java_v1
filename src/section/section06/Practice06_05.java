package section.section06;

import java.util.Arrays;

/**
 * 얇은 복사
 * <p>
 *     얇은 복사는 복사한 대상의 배열 값의 대해서는 공유 하지만
 *     두 배열 껍데기간의 주소값은 다르다
 * </p>
 *
 * @author 최병권
 * @version 1.0.0
 * @since 2026.07.24
 */
public class Practice06_05 {
    public static void main(String[] args) {
        int[] arr01 = {1,2,3};
        System.out.println("arr01 배열 : " + Arrays.toString(arr01));

        //배열의 단순 대입
        int [] arr02 = arr01;

        //얕은 복사
        int[] arr03 = arr01.clone();

        // 두 배열 간의 서로 다른 주소
        System.out.println("arr01" + arr01);
        System.out.println("arr02" + arr02);
        System.out.println("arr03" + arr03);

        //arr01, arr02 값 변경 후 출력
        arr02[1] = 10;
        System.out.println("arr01 배열 : " + Arrays.toString(arr01));
        System.out.println("arr02 배열 : " + Arrays.toString(arr02));
        System.out.println("arr03 배열 : " + Arrays.toString(arr02));

    } // end of main
} // end of class
