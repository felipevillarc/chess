package Aplication;

import Chess.ChessMatch;
public class Program {

	public static void main(String[] args) {
		
		ChessMatch c = new ChessMatch();
		
		UI.printBoard(c.getPieces());
		
	}

}
