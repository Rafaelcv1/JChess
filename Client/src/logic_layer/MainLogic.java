package logic_layer;

import data_layer.*;
import presentation_layer.*;

public class MainLogic {
    public MainLogic() {
        MainFrame mainFrame = new MainFrame();

        try {
            ClientConnection.connect("localhost", 1234);
        } catch (Exception e) {
            System.out.println("deu erro em conectar com o servidor ó: " + e);
        }
    }
    static public void movement(Tile tileIn, Tile tileOut) throws Exception {
        ClientConnection.sendAction(Action.MOVE, tileIn, tileOut);
    }
}
