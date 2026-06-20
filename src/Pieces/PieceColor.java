package Pieces;

public enum PieceColor {
    WHITE(0),
    BLACK(1);

    private final int color;

    PieceColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public PieceColor opposite(){
        return this == WHITE ? BLACK : WHITE;
    }
}
