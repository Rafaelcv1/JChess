package Board;

import Pieces.AbstractPiece;

public record Square(int row, int collumn, boolean hasPiece, AbstractPiece piece) {}