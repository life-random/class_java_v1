package section.section06;

public class Practice06_08 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        arr[1][0] = 11;
        arr[1][1] = 12;
        arr[1][2] = 13;

        // 행의 주소 출력
        System.out.println("2차원 배열 : " + arr);
        // 1행이 가진 열에 대한 주소 출력
        System.out.println("2차원 배열 1행 : " + arr[0]);

        // 행의 크기 출력
        System.out.println("행의 크기 : " + arr.length);
        // 각 행의 크기 출력
        System.out.println("1 행의 열 크기 : " + arr[0].length);
        System.out.println("2 행의 열 크기 : " + arr[1].length);
        // 1행 1열의 값 출력
        System.out.println("arr[0][0] = " + arr[0][0]);

    } // end of main
} // end of class
