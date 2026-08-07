package section.section06;

import java.util.Arrays;
import java.util.Comparator;

public class Practice06_04 {
    public static void main(String[] args) {
        Integer[] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};

        System.out.println("정렬 전  배열" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("오름차순 정렬 후  배열" + Arrays.toString(arr));
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println("내림차순 정렬 후  배열" + Arrays.toString(arr));
        System.out.println(arr);
        System.out.println(arr[0]);

    } // end of main
} // end of class
