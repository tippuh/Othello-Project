package csci.unca.nmarin.othello;

import java.awt.Color;
import java.awt.List;

public class Board {

	private static final int me = 1;
	private static final int opponent = -1;
	private static final int border = -2;
	private static final int empty = 0;
	public static Color  black;
	public static Color white;
	private int [][] gameBoard = new int[10][10];

	public Board(Color color) {
		for (int i = 0; i < gameBoard.length; i++) {
			for(int j = 0; j < gameBoard[i].length; j++) {
				if (i == 0 || i == gameBoard.length-1 || j == 0 || j == gameBoard.length-1) {
					gameBoard[i][j] = border;
				} else {
					gameBoard[i][j] = empty;
				}
			}
		}
		
		if (color == black) {
			gameBoard[4][4] = opponent;
			gameBoard[4][5] = me;
			gameBoard[5][4] = me;
			gameBoard[5][5] = opponent;
		}
		
		if (color == white) {
			gameBoard[4][4] = me;
			gameBoard[4][5] = opponent;
			gameBoard[5][4] = opponent;
			gameBoard[5][5] = me;
		}
	}
	
	public static List generateMoves() {
		return null;
		
	}
	
	public static void applyMove() {
		
	}
	
	public static int evaluate() {
		return 0;
	}
	
	public String toString() {
		String aString = "";
		  for(int i = 0; i < gameBoard.length; i++) {
			  aString += "\n";
		     for(int j = 0; j < gameBoard[i].length; j++) {
		        aString += " " + gameBoard[i][j];
		     }
		  }
		  return aString;
	}

}
