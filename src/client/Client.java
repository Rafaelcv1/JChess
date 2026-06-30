package client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8888);

        BufferedReader inputFromServer = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

        PrintWriter outputToServer = new PrintWriter(
                socket.getOutputStream(), true);

        new Thread(() -> {
           try {
               String message;

               while ((message = inputFromServer.readLine()) != null) {
                   System.out.println("Received from server: " + message);
               }
           } catch (IOException e) {
               System.err.println("IOException in inputFromServer " + e.getMessage());
           } catch (Exception e) {
               System.err.println("Exception in inputFromServer " + e.getMessage());
           }
        }).start();

        Scanner sc = new Scanner(System.in);

        while(true){
            String command = sc.nextLine();
            outputToServer.println(command);
        }
    }
}
