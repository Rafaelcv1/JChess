package server;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("Server started on port 8888");
        System.out.println("Waiting for first player");

        Socket whitePlayerSocket = serverSocket.accept();
        System.out.println("First player connected: " + whitePlayerSocket.getInetAddress().getHostAddress());
        System.out.println("Waiting for second player");

        Socket blackPlayerSocket = serverSocket.accept();
        System.out.println("Second player connected: " + blackPlayerSocket.getInetAddress().getHostAddress());
        System.out.println("Starting game room");

        new Thread(
                new ClientHandler(
                        whitePlayerSocket, blackPlayerSocket)
        ).start();

        new Thread(
                new ClientHandler(
                        blackPlayerSocket, whitePlayerSocket)
        ).start();
    }
}
