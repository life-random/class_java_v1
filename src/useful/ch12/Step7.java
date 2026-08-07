package useful.ch12;

import java.time.Duration;
import java.time.LocalTime;

public class Step7 {
    public static void main(String[] args) {

        LocalTime start = LocalTime.now();
        int sum  = 0;
        for (int i = 1; i <= 100_000_000; i++) {
            sum += i;
        }

        LocalTime end = LocalTime.now();
        Duration work = Duration.between(start, end);
        System.out.println("합계 : " +  sum);
        System.out.println("걸린 시간: " + work.toMillis() + " ms");
        System.out.println("걸린 시간: " + work.toSeconds() + " 초");
    }
}