package presentation_layer;

import logic_layer.pieces.*;
import javax.swing.*;
import java.awt.*;

public class Tile extends JButton {

    public Tile(Integer row, Integer col) {
        //set presentation_layer.Tile's visuals
        super.setMargin(new Insets(0,0,0,0));
        super.setFocusPainted(true);
        super.setPreferredSize(new Dimension(50,50));

        this.row = row;
        this.col = col;
    }

    public Integer getRow() {
        return row;
    }
    public Integer getCol() {
        return col;
    }
    public Piece getPiece() {
        return piece;
    }
    public void setPiece(Piece piece) {
        this.piece = piece;
        setIcon(piece.getIcon());
    }
    public void setColor(Boolean isWhite) {
        if (isWhite) {
            super.setBackground(new Color(255,255,255));
        } else {
            super.setBackground(new Color(10,10,10));
        }
    }

    private Piece piece;
    private final Integer row;
    private final Integer col;
}
