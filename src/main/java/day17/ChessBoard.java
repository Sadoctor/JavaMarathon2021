package day17;

public class ChessBoard {
    private ChessPiece [][] chessPieces;

    public ChessBoard(ChessPiece [][] chessPieces) {
        this.chessPieces = chessPieces;
    }

    public static void print(ChessBoard chessBoard){
        for (ChessPiece[] chessPiece : chessBoard.chessPieces) {
            for (ChessPiece piece : chessPiece) System.out.print(piece);
            System.out.println();
        }
    }
}
