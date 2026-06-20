package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable{
    private Socket mySocket;
    private Socket opponentSocket;

    public ClientHandler(Socket mySocket, Socket opponentSocket){
        this.mySocket = mySocket;
        this.opponentSocket = opponentSocket;
    }

    @Override
    public void run(){
        try {
            BufferedReader inputFromClient = new BufferedReader(
                    new java.io.InputStreamReader(mySocket.getInputStream()));

            PrintWriter outputToClient = new PrintWriter(
                    opponentSocket.getOutputStream(), true);

            String message;
            while((message = inputFromClient.readLine()) != null) {
                System.out.println("Received from client: " + message);
                outputToClient.println(message);
            }
        } catch (IOException e) {
            System.err.println("IOException in inputFromClient " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Exception in inputFromClient " + e.getMessage());
        }
    }
}
