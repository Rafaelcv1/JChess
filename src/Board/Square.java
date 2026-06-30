package Board;

import Pieces.AbstractPiece;
import Pieces.Position;

public record Square(Position position, String positionNotation, boolean hasPiece, AbstractPiece piece) {}