package csci.unca.nmarin.othello;

import java.awt.Color;
import java.awt.List;
import java.util.Scanner;

public class Board {

	public static final int me = 1;
	public  static final int opponent = -1;
	public static final int border = -2;
	public static final int empty = 0;
	private int HEIGHT = 10;
	private int WIDTH = 10;
	private int [][] gameBoard = new int[HEIGHT][WIDTH];

	public Board( String color) {
		for (int i = 0; i < gameBoard.length; i++) {
			for(int j = 0; j < gameBoard[i].length; j++) {
				if (i == 0 || i == gameBoard.length-1 || j == 0 || j == gameBoard.length-1) {
					gameBoard[i][j] = border;
				} else {
					gameBoard[i][j] = empty;
				}
			}
		}
		
		if (color.charAt(0) == 'B') {
			gameBoard[4][4] = opponent;
			gameBoard[4][5] = me;
			gameBoard[5][4] = me;
			gameBoard[5][5] = opponent;
		}
		
		else  {
			gameBoard[4][4] = me;
			gameBoard[4][5] = opponent;
			gameBoard[5][4] = opponent;
			gameBoard[5][5] = me;
		}
	}
	
	public List generateMoves() {
		return null;
		
	}
	public Move getMyMove() {
		return null;
	}
	
	public Move getOpponentMove(Scanner scan) {
		return null;
	}
	public void applyMove(int player, Move move) {
		
	}
	public boolean gameOver() {
		return true;
	}
	public static int evaluate() {
		return 0;
	}
	
	public String toString() {
		String aString = "";
		  for(int i = 0; i < gameBoard.length; i++) {
			 aString += "C";
		     for(int j = 0; j < gameBoard[i].length; j++) {
		        aString += " " + gameBoard[i][j];
		     }
		     aString += "\n";
		  }
		  return aString;
	}

}
