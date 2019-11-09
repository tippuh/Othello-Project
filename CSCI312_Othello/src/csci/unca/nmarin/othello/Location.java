package csci.unca.nmarin.othello;

public class Location {

	private int row;
	private int col;
	
	public Location(int x, int y) {
		row = x;
		col = y;
	}
	
	public Location(Location location) {
		row = location.getRow();
		col = location.getCol();
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}
	
	
}
