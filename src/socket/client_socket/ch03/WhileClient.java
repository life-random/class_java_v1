package socket.client_socket.ch03;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class WhileClient {

    public static void main(String[] args) {

        // 도전 과제
        // 소켓 준비 (서버 IP 준비, 포트번호)
        try (Socket socket = new Socket("localhost", 5000)) {
            System.out.println("서버와 연결이 되었습니다");

            // 소켓을 받아 I/O 스트림을 작성한다
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            // 클라이언트 측 keyboard 스트림을 작성한다
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            // while문으로 "exit"를 입력받기 전까지는 계속 되는 반복문 작성후
            // 계속 문자를 전송할 수 있는 코드를 작성한다
            String line;
            while (true) {
                System.out.println("[client]콘솔 로그 클라이언트 입력 >>>");
                String input = keyboardReader.readLine(); // 블로킹 sc.nextLine();
                writer.println(input); // 소켓과 연결된 출력스트림을 사용해서 서버측에 데이터 보냄
                if("exit".equalsIgnoreCase(input)){
                    break; // 즉 키보드 입력 스트림 종료
                }
                // 서버 측에서 보낸 메세지를 받아서 클라이언트 콘솔창에 출력
                String response = reader.readLine();
                if("exit".equalsIgnoreCase(response)){
                    break;
                }
                System.out.println("서버측 응답 >> " + response);
            }
            // 이후에는 상대 쪽에서 "exit"를 작성하기 전까지는 계속 응답을 받는 코드를 작성한다
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    } // end of main
}
