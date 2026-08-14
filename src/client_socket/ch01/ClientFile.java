package client_socket.ch01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientFile {

    public static void main(String[] args) {

        try (Socket socket = new Socket("192.168.5.4", 5000)) {
            System.out.println("클라이언트 : 서버에 연결했습니다");

            // 서버측으로 메세지를 보내기 위한 출력 스트림 사용
            // socket + PrintWriter : autoFlush 처리 됨
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            for (int i = 0; i < 1; i++) {
                writer.println((i + 1) + "메세지 잘 갔나요?"); // "\n"
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
