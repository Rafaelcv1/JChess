package logic_layer.pieces;

public class King extends Piece {
    public King(Team team) {
        super(team);

        if (getTeam() == Team.WHITE){
            super.setIcon(new javax.swing.ImageIcon("Client/src/logic_layer/pieces/icons/w_king.png"));
        } else {
            super.setIcon(new javax.swing.ImageIcon("Client/src/logic_layer/pieces/icons/b_king.png"));
        }
    }
}
