package day17;

public class Task2 {
    public static void main(String[] args) {

        ChessPiece[][] chessPiece2 = new ChessPiece[8][8];
        for (int i = 0; i < chessPiece2.length; i++)
            for (int j = 0; j < chessPiece2[i].length; j++)
                chessPiece2[i][j] = ChessPiece.EMPTY;

        chessPiece2 [0][0] = ChessPiece.ROOK_BLACK; chessPiece2 [0][5] = ChessPiece.ROOK_BLACK; chessPiece2 [0][6] = ChessPiece.KING_BLACK;
        chessPiece2 [1][1] = ChessPiece.ROOK_WHITE;chessPiece2 [1][4] = ChessPiece.PAWN_BLACK;chessPiece2 [1][5] = ChessPiece.PAWN_BLACK;chessPiece2 [1][7] = ChessPiece.PAWN_BLACK;
        chessPiece2 [2][0] = ChessPiece.PAWN_BLACK;chessPiece2 [2][2] = ChessPiece.KNIGHT_BLACK;chessPiece2 [2][6] = ChessPiece.PAWN_BLACK;
        chessPiece2 [3][0] = ChessPiece.QUEEN_BLACK;chessPiece2 [3][3] = ChessPiece.BISHOP_WHITE;
        chessPiece2 [4][3] = ChessPiece.BISHOP_BLACK;chessPiece2 [4][4] = ChessPiece.PAWN_WHITE;
        chessPiece2 [5][4] = ChessPiece.BISHOP_WHITE;chessPiece2 [5][5] = ChessPiece.PAWN_WHITE;
        chessPiece2 [6][0] = ChessPiece.PAWN_WHITE;chessPiece2 [6][3] = ChessPiece.QUEEN_WHITE;chessPiece2 [6][5] = ChessPiece.PAWN_WHITE;chessPiece2 [6][7] = ChessPiece.PAWN_WHITE;
        chessPiece2 [7][5] = ChessPiece.ROOK_WHITE;chessPiece2 [7][6] = ChessPiece.KING_WHITE;

//        ChessPiece[][] chessPiece1 = {
//                {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
//                {ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK},
//                {ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.KNIGHT_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY},
//                {ChessPiece.QUEEN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
//                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_BLACK, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
//                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY},
//                {ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.QUEEN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE},
//                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.KING_WHITE, ChessPiece.EMPTY}
//        };

//        ChessBoard chessBoard1 = new ChessBoard(chessPiece1);

        ChessBoard chessBoard2 = new ChessBoard(chessPiece2);

//        ChessBoard.print(chessBoard1);
        ChessBoard.print(chessBoard2);

    }
}