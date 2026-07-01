package logic_layer;

import javax.swing.*;

public class Rook extends Piece {
    public Rook(Team team) {
        super(team);
        if (getTeam() == Team.white) {
            super.setIcon(new ImageIcon("Client/src/logic_layer/icons/w_rook.png"));
        } else {
            super.setIcon(new ImageIcon("Client/src/logic_layer/icons/b_rook.png"));
        }
    }
    @Override
    public String toString() { return "logic_layer.Rook"; }
}
