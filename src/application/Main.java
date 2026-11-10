package application;

import boardgame.Board;
import chess.ChessMatch;
import chess.ChessPiece;

public class Main {
    static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
