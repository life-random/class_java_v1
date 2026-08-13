package socket.ch01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile {
    // 내 ip 주소 : 192.168.5.2
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("서버측 프로그램 시작 - 포트 번호 : 5000에서 대기 중...");
            // 클라이언트가 내 IP 주소와 포트번호를 사용해서 연결할 때까지 이줄에서 멈춤 (블로킹)
            Socket socket = serverSocket.accept();

            // I/O 에서 배웠던 스트림을 사용
            // 스트림 체이닝 연결 socket + 블릿지(InputStreamReader) + BufferedReader
            InputStream in = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            // 클라이언트가 보낸 데이터를 한 줄을 읽어 보자
            String message = br.readLine();
            System.out.println("클라리언트가 보낸 메세지 : " + message);

            FileOutputStream fous = new FileOutputStream("assets/server.txt");

            fous.write(message.getBytes());


            System.out.println("클라이언트가 연결 되었습니다");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}