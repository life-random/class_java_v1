package section.section06;

import java.util.Arrays;

public class Practice06_test4 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int count = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int col = (5 - j + (i * 2)) % 5;
                int row = (7 + j - i) % 5;
                arr[col][row] = ++count;
            }
        }
        // 2중 배열을 출력할 때 : Array에 deepTOString(2중 배열)을 이용하라
        System.out.println(Arrays.deepToString(arr));
    } // end of main
} // end of class
