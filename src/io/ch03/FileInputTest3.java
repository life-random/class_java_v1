package io.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest3 {

    public static void main(String[] args) {
        // 도전 과제 1
        // in.read(byte[] b) 를 사용해서 코드를 완성해보세요

        // 데이터를 담아 둘 그릇(바구니)를 미리  만들어 둔다.
        // 크기 10 = 한 번에 최대 10바이트까지 읽어 오겠다라고 설정함
        byte[] buffer = new byte[10];

        // read(byte[])는 읽은 바이트 수를 반환 합니다.
        // read()가 바이트 값 자체 를 돌려 주는 것 과는 다르다.
        int readCount;

        try (FileInputStream in = new FileInputStream("assets/a.txt")) {
            while ((readCount = in.read(buffer)) != -1 ){
                // buffer.length ...
                for (int i = 0; i < readCount; i++){
                    System.out.print((char)buffer[i]);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
