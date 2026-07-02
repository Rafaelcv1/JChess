package logic_layer.pieces;

import javax.swing.*;

public class Knight extends Piece {
    public Knight(Team team) {
        super(team);

        if (getTeam() == Team.WHITE){
            super.setIcon(new ImageIcon("Client/src/logic_layer/pieces/icons/w_knight.png"));
        } else {
            super.setIcon(new ImageIcon("Client/src/logic_layer/pieces/icons/b_knight.png"));
        }
    }
}