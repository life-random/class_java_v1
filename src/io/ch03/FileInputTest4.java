package io.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

public class FileInputTest4 {

    public static void main(String[] args) {
        byte[] buffer = new byte[255];
        int readCount;
        int readData;

        //코드 시작 시간
        LocalDateTime start = LocalDateTime.now();

        try (FileInputStream in = new FileInputStream("assets/b.txt")) {
            while ( (readData = in.read() ) != -1){
                System.out.print((char)readData);
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 코드 종료 시간
        LocalDateTime end = LocalDateTime.now();
        System.out.println(" \n\n\n ");
        Duration workTime = Duration.between(start, end);
        System.out.println("개별 출력 시간");
        System.out.println(workTime + "ms");
        System.out.println(" \n\n\n ");

        //코드 시작 시간
        start = LocalDateTime.now();

        try (FileInputStream in = new FileInputStream("assets/b.txt")) {
            while ( (readCount = in.read(buffer) ) != -1){
                for (int i = 0; i < readCount; i++) {
                    System.out.print((char)buffer[i]);
                }
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 코드 종료 시간
        end = LocalDateTime.now();

        workTime = Duration.between(start, end);
        System.out.println(" \n\n\n ");
        System.out.println("255byte 버퍼 사용");
        System.out.println(workTime + "ms");
        System.out.println(" \n\n\n ");
    }
}
