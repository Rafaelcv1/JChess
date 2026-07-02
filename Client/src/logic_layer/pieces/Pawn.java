package logic_layer.pieces;

public class Pawn extends Piece{
    public Pawn(Team team) {
        super(team);

        if (getTeam() == Team.WHITE){
            super.setIcon(new javax.swing.ImageIcon("Client/src/logic_layer/pieces/icons/w_pawn.png"));
        } else {
            super.setIcon(new javax.swing.ImageIcon("Client/src/logic_layer/pieces/icons/b_pawn.png"));
        }
    }
}
