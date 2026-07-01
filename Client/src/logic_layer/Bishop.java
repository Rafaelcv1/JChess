package logic_layer;

import javax.swing.*;

public class Bishop extends Piece {
    public Bishop(Team team) {
        super(team);
        if (getTeam() == Team.white) {
            super.setIcon(new ImageIcon("Client/src/logic_layer/icons/w_bishop.png"));
        } else {
            super.setIcon(new ImageIcon("Client/src/logic_layer/icons/b_bishop.png"));
        }
    }
    @Override
    public String toString() { return "logic_layer.Bishop"; }
}
