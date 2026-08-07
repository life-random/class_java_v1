package useful.ch12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Step1 {

    public static void main(String[] args) {
        // 지금 이 순간의 날짜/ 시간 가져오기
        LocalDate today = LocalDate.now();          // 날짜만
        LocalDateTime now = LocalDateTime.now();    // 날짜와 시간까지

        System.out.println("오늘 날짜 : " + today);
        System.out.println("현재 시각 : " + now);

        System.out.println("----------------------");
        //원하는 날짜를 직접 설정
        LocalDate birthday = LocalDate.of(2002, 8, 15);
        System.out.println("설정한 날짜 : " + birthday);
        System.out.println("생일 요일 : " + birthday.getDayOfWeek());

        // 만약 한글로 표현하고 싶다면
        System.out.println(birthday.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
    }
}
