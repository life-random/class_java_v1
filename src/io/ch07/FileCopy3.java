package io.ch07;

import java.io.*;

public class FileCopy3 {

    public static void main(String[] args) {

        // 1. 파일 위치를 지정한다 (원본 경로, 복사될 경로)
        // 2. Stream (File I/O) - 바이트 기반
        // 3. 소요시간 측정

        String sourceFilePath = "assets/employees.zip";
        String destinationFilePath = "assets/employees_copy.zip";
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             FileOutputStream fos = new FileOutputStream((destinationFilePath));
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos)
        ){

            byte[] buffer = new byte[1024];
            // bis.read()는 읽은 수만큼 반환하기 때문에 측정용 필요
            int bytesRead;
            while ( ( bytesRead = bis.read(buffer) ) != -1 ) {
                //System.out.println(bytesRead);
                bos.write(buffer, 0, bytesRead); // 읽은 만큼만 씀
            }
            System.out.println("파일 복사 완료");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long endTime = System.nanoTime();
        long duartion = endTime - startTime;
        System.out.println("나노 초 : " + duartion);
        System.out.println("초 값 : " + duartion / 1_000_000_000.0);
    }
}
