package io.ch06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

public class FileCopy {

    public static void main(String[] args) {
        FileInputStream fis;
        FileOutputStream fos;

        try {
            fis = new FileInputStream("assets/img1.zip");
            fos = new FileOutputStream("assets/img2.zip", true);
            int data;
            LocalDateTime start = LocalDateTime.now();

            while ( (data = fis.read()) != -1 ){
                fos.write((char)data);
                fos.flush();
            }

            LocalDateTime end = LocalDateTime.now();

            long downloadTime = Duration.between(start, end).toSeconds();
            System.out.println("파일을 다운로드 하는데 " + downloadTime + "초 걸렸습니다");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
