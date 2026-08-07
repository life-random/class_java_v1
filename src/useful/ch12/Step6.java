package useful.ch12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Step6 {

    public static void main(String[] args) {
//        **요구사항**
//
//                1. 생일이 무슨 요일이었는지 (한글로)
//        2. 기준 날짜 시점의 만 나이
//        3. 태어난 지 총 며칠이 지났는지
//        4. 기준 날짜부터 크리스마스까지 D-day
//        5. 기준 시각을 "2025년 05월 13일 오후 02시 30분" 형식으로 출력
//
//**기대 출력**
//
//```
//        생일 요일: 금요일
//        만 나이: 25세
//        살아온 날: 9132일
//        크리스마스까지: 226일
//        현재: 2025년 05월 13일 오후 02시 30분
//```

        LocalDate birth = LocalDate.of(2002,8,15);
        LocalDate now = LocalDate.now();

        System.out.println("생일 요일: " + birth.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));

        long currentDay = ChronoUnit.DAYS.between(birth, now);
        System.out.println("만 나이: " + currentDay + "일");

        System.out.println("살아온 날들: " + currentDay + "일");

        LocalDate crismas = LocalDate.of(2026, 12, 25);
        long stillCrismas = ChronoUnit.DAYS.between(now, crismas);
        System.out.println("크리스마스까지: " + stillCrismas + "일");

        LocalDateTime nowTime = LocalDateTime.now();
        DateTimeFormatter nowTime2 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분");
        System.out.println("현재: " + nowTime.format(nowTime2));
    }
}
