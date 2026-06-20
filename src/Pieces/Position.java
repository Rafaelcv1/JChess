package Pieces;

public record Position(int row, int collumn) {
    public Position {
        if (row < 0 || row > 7 || collumn < 0 || collumn > 7){
            throw new IllegalArgumentException("Position outside the board");
        }
    }
}
