package useful.ch04;

public class ArrayExceptionHandling {

    public static void main(String[] args) {

        // 배열 선언과 동시에 초기화
        int[] arr = {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        } catch (Exception e) {
            // System.out.println("catch 브록으로 넘어 왔음");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

//        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException;
//        for (int i = 0; i < 10; i++) {
//            System.out.println("arr[" + i + "] = " + arr[i]);
//        }
        System.out.println("시스템이 비정상 종료되지 않았음");



    } // end of main
} // end of class
