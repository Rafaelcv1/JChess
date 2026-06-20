package Pieces;

import Board.ChessBoard;

import java.util.List;

abstract public class AbstractPiece {
    protected Position position;
    protected Integer value;
    protected PieceColor color;

    public AbstractPiece(Position position, PieceColor color) throws IllegalArgumentException{
        this.position = position;
        this.color = color;
    }

    // Get the possible moves for the piece, based on the surroundings pieces and board border
    // TODO - this method should be implemented in the concrete pieces, and should call the getPossibleMovesByMovement and getPossibleMovesByCapture methods
    abstract public List<Position> getPossibleMoves();
    abstract protected List<Position> getPossibleMovesByMovement();
    abstract protected List<Position> getPossibleMovesByCapture();

    public Integer getValue() {
        return value;
    }

    public PieceColor getColor(){
        return this.color;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
