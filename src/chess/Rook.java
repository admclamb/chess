package chess;

public class Rook extends Piece {
	int points;
	private int[][] possibleMoves;
	public Rook(String color) {
		super(color, "Rook");
		this.points = 5;
		this.possibleMoves = new int[][]{
			{0,1},
			{0,2},
			{0,3},
			{0,4},
			{0,5},
			{0,6},
			{0,7},
			{0,8},
			{1,0},
			{2,0},
			{3,0},
			{4,0},
			{5,0},
			{6,0},
			{7,0},
			{8,0},
			{0,-1},
			{0,-2},
			{0,-3},
			{0,-4},
			{0,-5},
			{0,-6},
			{0,-7},
			{0,-8},
			{-1,0},
			{-2,0},
			{-3,0},
			{-4,0},
			{-5,0},
			{-6,0},
			{-7,0},
			{-8,0},
		};
	}

	public int[][] getMoves() {
		return possibleMoves;
	}
}
