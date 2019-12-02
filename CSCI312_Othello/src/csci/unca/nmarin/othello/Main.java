package csci.unca.nmarin.othello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("C Initialize your color I B or I W: ");
		String myColor = scan.nextLine().substring(2);
		int currentPlayer;

		Board gameBoard = new Board(myColor); // Initialize Board
		
		
		if (myColor.equals("B"))
			currentPlayer = Board.me;
		else
			currentPlayer = Board.opponent;

		while (!gameBoard.gameOver()) {
			Move move;
			if (currentPlayer == Board.me) {
				move = gameBoard.getMyMove();
				System.out.printf("%s %s\n", myColor, move);
			} else {
				move = gameBoard.getOpponentMove(scan);
			}
			gameBoard.applyMove(currentPlayer, move);
			System.out.print(gameBoard);
			currentPlayer = -1 * currentPlayer; // switchPlayers
		}

		
	}

}
