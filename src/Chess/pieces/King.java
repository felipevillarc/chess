package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
	
	public King(Board b, Color c) {
		super(b, c);
	}
	
	@Override
	public String toString() {
		return "K"; 
	}
}
