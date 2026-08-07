package useful.ch12;

public class Step7 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int sum  = 0;
        for (int i = 1; i <= 100_000_000; i++) {
            sum += i;
        }

        long end = System.currentTimeMillis();
        System.out.println("걸린 시간: " + (end - start) + " ms");
    }
}