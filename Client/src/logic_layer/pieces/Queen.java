package logic_layer.pieces;

public class Queen extends Piece {
    public Queen(Team team) {
        super(team);

        if (getTeam() == Team.WHITE){
            super.setIcon(new javax.swing.ImageIcon("Client/src/logic_layer/pieces/icons/w_queen.png"));
        } else {
            super.setIcon(new javax.swing.ImageIcon("Client/src/logic_layer/pieces/icons/b_queen.png"));
        }
    }
}
