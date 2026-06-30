package presentation_layer;

import javax.swing.*;

import data_layer.ClientConnection;
import logic_layer.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("JChess");

        // try to connect to the server
        // TODO: shouldn't be the Frame that connects with the server!!!
        try {
            ClientConnection.connect("localhost", 1234);
        } catch (Exception e) {
            System.out.println("deu erro em conectar com o servidor ó: " + e);
        }

        // gen all Tiles (JButtons), set them Listeners and add them to mainPanel
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tiles[i][j] = new Tile(i, j);
                tiles[i][j].setColor((i + j) % 2 == 0);
                int finalI = i;
                int finalJ = j;
                tiles[i][j].addActionListener(_ -> onClick(tiles[finalI][finalJ]));

                mainPanel.add(tiles[i][j]);
            }
        }
        super.add(mainPanel);

        // TODO: receive server's board (shouldn't be in frame too)
        // placeholder for server's board
        tiles[0][0].setPiece(new Rook(Team.black));
        tiles[0][7].setPiece(new Rook(Team.black));
        tiles[0][2].setPiece(new Bishop(Team.black));
        tiles[0][5].setPiece(new Bishop(Team.black));
        tiles[7][0].setPiece(new Rook(Team.white));
        tiles[7][7].setPiece(new Rook(Team.white));
        tiles[7][5].setPiece(new Bishop(Team.white));
        tiles[7][2].setPiece(new Bishop(Team.white));

        //set Frame
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        super.setSize(450,500);
        super.setVisible(true);
    }
    private void onClick(Tile tile) {
        if (this.lastSelectedTile == null) {
            this.lastSelectedTile = tile;
        } else if (this.lastSelectedTile == tile) {
            this.lastSelectedTile = null;
        } else {
            try {
                ClientConnection.movement(this.lastSelectedTile, tile);
                this.lastSelectedTile = null;
            } catch (Exception e) {
                System.out.println("deu erro em enviar o movemento ó: " + e);
            }
        }
    }
    {
        tiles = new Tile[8][8];
        mainPanel = new JPanel();
    }

    private final Tile[][] tiles;
    private final JPanel mainPanel;
    private Tile lastSelectedTile;
}