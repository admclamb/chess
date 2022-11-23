package chess;

public class Knight extends Piece {
	int points;
	private int[][] possibleMoves;
	public Knight(String color) {
		super(color, "Knight");
		this.points = 3;
		this.possibleMoves = new int[][]{
			{-2,1},
			{-1,2},
			{1,2},
			{2,1},
			{2,-1},
			{1,-2},
			{-1,-2},
			{-2,-1}
		};
	}
	
	public int[][] getMoves() {
		return possibleMoves;
	}
}
