package Board;

public class ChessAlgebricNotation {
    private String[][] chessBoardNotation;

    public ChessAlgebricNotation(){
        chessBoardNotation = new String[8][8];
        char squareLetter = 'a';
        for (int i = 0; i < chessBoardNotation.length; i++) {
            for (int j = 0; j < chessBoardNotation[i].length; j++) {
                chessBoardNotation[i][j] = squareLetter + Integer.toString(8 - i);
                squareLetter++;
            }
            squareLetter = 'a';
        }
    }
}
