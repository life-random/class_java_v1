package socket.client_socket.ch03;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class MultyThreadClient {
    public static void main(String[] args) {
        InetAddress local = null;
        try {
            local = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        final String MY_IP = local.getHostAddress();
        final String MY_HOST = local.getHostName();

        // 1, 소켓 ( host, 포트번호)
        try (Socket socket = new Socket("localhost", 5001)) {
            System.out.println("서버와 교신 완료");
            // 2. I/O 스트림 및 키보드 스트림 생성
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            // 3. reader Thread 생성
            Thread readThread = new Thread(() -> {
                // 3-2. try 생성
                try {
                    // 3-1. server 메세지 담을 변수 생성
                    String serverMessage;
                    // 3-3. while문 생성
                    // 3-4. 메시지 콘솔에 입력
                    while ( (serverMessage = reader.readLine()) != null){
                        // 3-5. server로 부터 "exit" 메시지를 받았더라면 출력 후 break
                        if ("exit".equalsIgnoreCase(serverMessage)){
                            System.out.println("서버가 종료를 원합니다");
                            break;
                        }


                        System.out.println(serverMessage);
                    }
                } catch (IOException e) {
                    System.out.println("서버가 강제로 종료했습니다");
                }
            });

            // 4. Writer Thread 생성
            Thread writeThread = new Thread(() -> {
                // 3-1. 키보드 메세지 담을 변수 생성
                String clientMessage;
                String nickname = MY_IP;
                // 3-2. try 생성
                try {
                    // 3-3. while문 생성
                    while ( (clientMessage = keyboardReader.readLine()) != null){
                        // 3-4. "exit" 메시지를 입력했다면 전송 후 break
                        if ("exit".equalsIgnoreCase(clientMessage)){
                            System.out.println("클라이언트 종료 됨");
                            break;
                        }
                        // 프로토콜 IP 전송
                        if("ip config".equalsIgnoreCase(clientMessage)){
                            writer.println("[ IP : " + MY_IP + "]");
                            writer.println("[ HOST : " + MY_HOST + "]");
                            continue;
                        }
                        // 닉네임 변경
                        if(clientMessage.startsWith("/rename ")){
                            String newNickname = clientMessage.substring(8);
                            writer.println(nickname + "님의 닉네임이 " + newNickname + "으로 변경되었습니다.");
                            nickname = newNickname;
                            continue;
                        }
                        // 3-5. 키보드 메시지 전송
                        writer.println("[" + nickname + "] :" + clientMessage);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            // 5. 스레드 실행 및 join 설정
            readThread.start();
            writeThread.start();
            readThread.join();
            writeThread.join();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
