package Pieces;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends AbstractPiece{
    private Integer relativeValue;
    {
        super.value = 1;
    }
    public Pawn(Position position, PieceColor color) throws IllegalArgumentException{
        super(position, color);
    }

    @Override
    public List<Position> getPossibleMoves() {
        List<Position> possibleMoves = new ArrayList<>();

        return possibleMoves;
    }

    @Override
    protected List<Position> getPossibleMovesByMovement() {
        return List.of();
    }

    @Override
    protected List<Position> getPossibleMovesByCapture() {
        return List.of();
    }

    // A pawn near to be promoted can be more valuable
    public void setRelativeValue(Integer value) {
        if (value < 1 || value > 8) {
            throw new IllegalArgumentException("Invalid value: " + value);
        }
        this.relativeValue = value;
    }

    public Integer getRelativeValue(){
        return this.relativeValue;
    }
}
