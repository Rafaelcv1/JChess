package Pieces;

import java.util.List;

public class Knight extends AbstractPiece{
    {
        this.value = 3;
    }

    public Knight (Position position, PieceColor color) throws IllegalArgumentException {
        super(position, color);
    }
    @Override
    public List<Position> getPossibleMoves() {
        return List.of();
    }

    @Override
    protected List<Position> getPossibleMovesByMovement() {
        return List.of();
    }

    @Override
    protected List<Position> getPossibleMovesByCapture() {
        return List.of();
    }
}
