package Pieces;

import java.util.List;

public class Queen extends AbstractPiece{
    {
        this.value = 9;
    }

    public Queen(Position position, PieceColor color) throws IllegalArgumentException {
        super(position, color);
    }

    @Override
    public java.util.List<Position> getPossibleMoves() {
        return java.util.List.of();
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
