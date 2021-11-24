package Boardgame;

public class Position {
	
	protected int row;
	protected int column;
	
	public Position (int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}


	public int getColumn() {
		return column;
	}

	
	public void setValues(int row, int column) {
		this.column = column;
		this.row = row;
	}
	@Override
	public String toString() {
		return this.getRow() + ", " + this.getColumn();
	}
}
