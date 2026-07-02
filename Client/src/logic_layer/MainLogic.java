package logic_layer;

import data_layer.*;
import presentation_layer.*;

public class MainLogic {
    public MainLogic() {
        MainFrame mainFrame = new MainFrame();

        try {
            ClientConnection.connect("localhost", 1234);
        } catch (Exception e) {
            System.out.println("Client could not connect to the server: " + e);
        }
    }
    static public void movement(Tile tileIn, Tile tileOut) throws Exception {
        ClientConnection.sendAction(Action.MOVE, tileIn, tileOut);
    }
}
