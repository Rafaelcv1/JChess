import java.io.*;
import java.net.ServerSocket;

public class ServerConnection {
    static public void startServer(int port) throws Exception{
        serverSocket = new ServerSocket(port);

        // receive from client
        receivedFromClient = new DataInputStream(serverSocket.accept().getInputStream());
        receiveFromClient();

        // send to client
    }
    private static void receiveFromClient() throws IOException {
        while (true) {
            System.out.println(receivedFromClient.readUTF());
        }
    }
    static private ServerSocket serverSocket;
    static private DataInputStream receivedFromClient;
}
