package section.section06;

public class Practice06_03 {
    public static void main(String[] args) {

        int[] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};
        int temp = 0;

        System.out.print("정렬 전 출력 :");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i]);
        }
        System.out.println();

        for (int i = arr.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } // end of if

            } // end of for(j)

        } // end of for(i)

        System.out.print("정렬 후 출력 :");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i]);
        }

    } // end of main

} // end of class
