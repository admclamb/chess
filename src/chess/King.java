package chess;

public class King extends Piece {
	int points;
	private int[][] possibleMoves;
	public King(String color) {
		super(color, "King");
		this.points = 0;
		this.possibleMoves = new int[][]{
			{-1,0},
			{-1,-1},
			{0,1},
			{1,1},
			{1,0},
			{1,-1},
			{0,-1},
			{-1,-1}
		};
	}

	public int[][] getMoves() {
		return possibleMoves;
	}
}
