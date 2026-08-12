package io.ch04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TypingRecord {
    public static void main(String[] args) {
        // 키보드에서 값을 입력 받아서 내가 정의한 파일에 그대로 저장 시키는 기능을 구현해 보자
        Scanner sc = new Scanner(System.in);

        System.out.println("======= 타자 연습 기록기 =======");
        LocalDateTime start = LocalDateTime.now();
        System.out.print("연습한 문장을 입력하세요 : ");
        String input = sc.nextLine();
        LocalDateTime end = LocalDateTime.now();

        Duration workTime = Duration.between(start, end);
        System.out.println("단어 입력 시간 : " + workTime.toSeconds() + "초");

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("assets/typing.txt", true);
            input += "\n";
            byte[] word = input.getBytes();
            fos.write(word);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        sc.close();
    }
}
