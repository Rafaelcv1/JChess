package data_layer;

import logic_layer.Action;
import presentation_layer.Tile;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public final class ClientConnection {
    //connects with the server
    static public void connect(String ip, int port) throws Exception {
        socket = new Socket(ip,port);
        sendToServer = new DataOutputStream(socket.getOutputStream());
    }

    //TODO (in super future): a serverless movement (using proxy maybe???)
    //send move to server
    static public void sendAction(Action action, Tile tileIn, Tile tileOut) throws Exception {
        String template = "{\"action\":%s,\"data\":{\"startPiece\":%s,\"startRow\":%d,\"startCol\":%d,\"endPiece\":%s,\"endRow\":%d\"endCol\":%d}}";
        sendToServer.writeUTF(String.format(template, action, tileIn.getPiece(), tileIn.getRow(), tileIn.getCol(), tileOut.getPiece(), tileOut.getRow(), tileOut.getCol()));
        sendToServer.flush();
    }
    static

    private Socket socket;
    private static DataOutputStream sendToServer;
    private static DataInputStream receivedFromServer;
}
