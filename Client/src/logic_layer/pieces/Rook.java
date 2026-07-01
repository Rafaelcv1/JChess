package logic_layer.pieces;

import javax.swing.*;

public class Rook extends Piece {
    public Rook(Team team) {
        super(team);
        if (getTeam() == Team.WHITE) {
            super.setIcon(new ImageIcon("Client/src/logic_layer/pieces/icons/w_rook.png"));
        } else {
            super.setIcon(new ImageIcon("Client/src/logic_layer/pieces/icons/b_rook.png"));
        }
    }
    @Override
    public String toString() { return "Rook"; }
}
