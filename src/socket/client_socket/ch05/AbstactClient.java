package socket.client_socket.ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public abstract class AbstactClient {

    private String name;
    private Socket socket;
    private PrintWriter socketWriterStream;
    private BufferedReader socketReaderStream;
    private BufferedReader keyboardReaderStream;

    public AbstactClient(String name) {
        this.name = name;
    }

    // 메서드를 통해서 socket 주입 받을 수 있다.
    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public final void run(){
        try {
            connetToServer();
            setupStream();
            startCommunication();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    // 상속 받은 자식 클래스는 무조건 이 메서드를 재정의 해야 된다. (강제성 부여)
    protected abstract void connetToServer();

    private void setupStream() throws IOException {
        socketWriterStream = new PrintWriter(socket.getOutputStream(), true);
        socketReaderStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        keyboardReaderStream = new BufferedReader(new InputStreamReader(System.in));
    }

    private void startCommunication() throws InterruptedException {

        // 1. 서버에서  보낸 데이터를 받기
        Thread readThread = new Thread(() -> {
            String msg;
            try {
                while ( (msg = socketReaderStream.readLine()) != null){
                    System.out.println(msg);
                    // 프로토콜 생략 ...
                }
            } catch (Exception e) {
                System.out.println("서버와의 연결이 끊겼습니다");
            }
        });

        // 키보드에서 값을 받아서 서버로 메세지 전송
        Thread writeThread = new Thread(() -> {
            try {
                String input;
                while ( (input = keyboardReaderStream.readLine()) != null ){
                    socketWriterStream.println("[" + name + "] : " + input);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        readThread.start();
        writeThread.start();


        readThread.join();
        writeThread.join();
    }
}