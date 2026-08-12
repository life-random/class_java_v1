package io.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest1 {

    public static void main(String[] args) {
        FileInputStream in = null;
        int readData;

        try {
            in = new FileInputStream("assets/a.txt");
            // 파일의 첫 번째 데이터를 한 바이트로 일기
            readData = in.read();
            System.out.println("1 : " + readData);
            System.out.println("1 : " + (char)readData);

            // 파일의 두 번 째 데이터를 한 바이트로 읽기
            readData = in.read();
            System.out.println("2 : " + readData);
            System.out.println("2 : " + (char)readData);

            // 도전 과제 - 반복적인 부분 확인하고 끝까지 파일에서 테이터를 읽는 코드를 작성해주세요
            while( (readData = in.read()) != -1){
                System.out.print((char)readData);
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (in != null){
                    in.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
