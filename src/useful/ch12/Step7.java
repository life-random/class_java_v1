package useful.ch12;

public class Step7 {
    public static void main(String[] args) {

        int sum  = 0;
        for (int i = 1; i <= 100_000_000; i++) {
            sum += i;
        }
    }
}