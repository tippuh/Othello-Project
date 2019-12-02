package csci.unca.nmarin.othello;

public class Move {

	private int row;
	private int col;
	
	public Move() {//pass move
		row = 0;
		col = 0; 
	}
	
	public Move(int x, int y) {
		row = x;
		col = y;
	}
	
	public Move(Move location) {
		row = location.getRow();
		col = location.getCol();
	}
	
	public Move(String moveStr) {
		//convert moveStr from a string in the format color col row   to 
		//this classes'  row and col
	}

	public int getRow() {
		return row;
	}


	public int getCol() {
		return col;
	}
	
	public String toString() {
		//convert the representation from this classes' row and col to the output string 
		// where col is 'a'...'h' and row is '1' to '8' ...
		//if pass move return empty str
		String result = "";
		
		return result;
	}
	
}
