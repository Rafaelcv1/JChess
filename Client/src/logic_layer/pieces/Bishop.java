package logic_layer.pieces;

import javax.swing.*;

public class Bishop extends Piece {
    public Bishop(Team team) {
        super(team);
        if (getTeam() == Team.WHITE) {
            super.setIcon(new ImageIcon("Client/src/logic_layer/pieces/icons/w_bishop.png"));
        } else {
            super.setIcon(new ImageIcon("Client/src/logic_layer/pieces/icons/b_bishop.png"));
        }
    }
    @Override
    public String toString() { return "Bishop"; }
}
