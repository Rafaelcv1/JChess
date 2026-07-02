package presentation_layer;

import javax.swing.*;
import logic_layer.pieces.*;
import logic_layer.MainLogic;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("JChess");

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
        tiles[0][0].setPiece(new Rook(Team.BLACK));
        tiles[0][7].setPiece(new Rook(Team.BLACK));
        tiles[0][2].setPiece(new Bishop(Team.BLACK));
        tiles[0][5].setPiece(new Bishop(Team.BLACK));
        tiles[7][0].setPiece(new Rook(Team.WHITE));
        tiles[7][7].setPiece(new Rook(Team.WHITE));
        tiles[7][5].setPiece(new Bishop(Team.WHITE));
        tiles[7][2].setPiece(new Bishop(Team.WHITE));

        //set Frame
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        super.setSize(450,500);
        super.setVisible(true);
    }

    //TODO: display possible plays (send lastSelectedTile to MainLogic)
    private void onClick(Tile tile) {
        if (this.lastSelectedTile == null) {
            this.lastSelectedTile = tile;
        } else if (this.lastSelectedTile == tile) {
            this.lastSelectedTile = null;
        } else {
            try {
                MainLogic.movement(lastSelectedTile, tile);
                this.lastSelectedTile = null;
            } catch (Exception e) {
                System.out.println("Error to send the movement to the server: " + e);
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