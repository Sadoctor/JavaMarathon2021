package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chessPieces1 = {ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};
        for (ChessPiece chessPiece: chessPieces1){
            System.out.print(chessPiece.getName() + " ");
        }
    }
}