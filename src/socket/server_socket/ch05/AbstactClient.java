package socket.server_socket.ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public abstract class AbstactClient extends Thread{
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private static final int PORT = 5002;
    private static Vector<PrintWriter> clientWriterList = new Vector<>();

    public final void run(){
        connetToServer();
        setupStream();
        startCommunication();
    }

    public AbstactClient(Socket socket) {
        this.socket = socket;
    }

    public void setSoctket(Socket soctket){
        this.socket = soctket;
    }

    protected abstract void connetToServer();

    private void setupStream() {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while(true){
                socket = serverSocket.accept();
//                new AbstactClient(socket).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void startCommunication() {
        
    }
}
