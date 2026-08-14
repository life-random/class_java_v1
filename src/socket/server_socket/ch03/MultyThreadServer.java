package socket.server_socket.ch03;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


public class MultyThreadServer {



    public static void main(String[] args) {
        InetAddress local = null;
        try {
            local = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        final String MY_IP = local.getHostAddress();
        final String MY_HOST = local.getHostName();

        try (ServerSocket serverSocket = new ServerSocket(5001)) {
            System.out.println("=== 서버 실행 ===");
            Socket socket = serverSocket.accept();
            System.out.println("===클라이언트와 연결 되었습니다.===");
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            // 읽기 스레드 : 클라이언트에게 온 메세지만 수신 함
            Thread readThread = new Thread(() -> {
                String clientMessage;
                try {
                    while( (clientMessage = reader.readLine()) != null){
                        System.out.println(clientMessage);
                        if ("exit".equalsIgnoreCase(clientMessage)){
                            System.out.println("클라이언트가 종료를 원합니다");
                            break;
                        }
                    }
                } catch (IOException e) {
                    // throw new RuntimeException(e);
                    System.out.println("클라이언트가 강제로 연결을 끊었습니다");
                }
            });

            // 쓰기 스레드 : 키보드에서 값을 입력받아서 클라이언트에게 전달
            Thread writeThread = new Thread(() -> {
                String serverMessage;
                String nickname = MY_IP;
                try {
                    while ( (serverMessage = keyboardReader.readLine()) != null){
                         if("exit".equalsIgnoreCase(serverMessage)){
                             writer.println(serverMessage);
                             System.out.println("서버가 종료했습니다");
                             break;
                         }
                         // 프로토콜 IP 전송
                        if("ip config".equalsIgnoreCase(serverMessage)){
                            writer.println("[ IP : " + MY_IP + "]");
                            writer.println("[ HOST : " + MY_HOST + "]");
                            continue;
                        }
                        // 닉네임 변경
                        if(serverMessage.startsWith("/rename ")){
                            String newNickname = serverMessage.substring(8);
                            writer.println(nickname + "님의 닉네임이 " + newNickname + "으로 변경되었습니다.");
                            nickname = newNickname;
                            continue;
                        }
                        writer.println("[" + nickname + "] :" + serverMessage); // '\n' 포함
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            readThread.start();
            writeThread.start();

            // 메인 스레드는 내가 끝날 때까지 기다려
            readThread.join();
            writeThread.join();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}