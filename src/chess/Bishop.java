package chess;

public class Bishop extends Piece {
	int points;
	private int[][] possibleMoves;
	public Bishop(String color) {
		super(color, "Bishop");
		this.points = 3;
		this.possibleMoves = new int[][]{
			{1,1},
			{2,2},
			{3,3},
			{4,4},
			{5,5},
			{6,6},
			{7,7},
			{8,8},
			{-1,1},
			{-2,2},
			{-3,3},
			{-4,4},
			{-5,5},
			{-6,6},
			{-7,7},
			{-8,8},
			{-1,-1},
			{-2,-2},
			{-3,-3},
			{-4,-4},
			{-5,-5},
			{-6,-6},
			{-7,-7},
			{-8,-8},
			{1,-1},
			{2,-2},
			{3,-3},
			{4,-4},
			{5,-5},
			{6,-6},
			{7,-7},
			{8,-8}
		};
	}

	public int[][] getMoves() {
		return possibleMoves;
	}
}
