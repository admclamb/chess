package chess;

public class Queen extends Piece {
	int points;
	private int[][] possibleMoves;
	public Queen(String color) {
		super(color, "Queen");
		this.points = 9;
		this.possibleMoves = new int[][]{
			// king moves
			{-1,0},
			{-1,-1},
			{0,1},
			{1,1},
			{1,0},
			{1,-1},
			{0,-1},
			{-1,-1},
			// bishop moves
			{2,2},
			{3,3},
			{4,4},
			{5,5},
			{6,6},
			{7,7},
			{8,8},
			{-2,2},
			{-3,3},
			{-4,4},
			{-5,5},
			{-6,6},
			{-7,7},
			{-8,8},
			{-2,-2},
			{-3,-3},
			{-4,-4},
			{-5,-5},
			{-6,-6},
			{-7,-7},
			{-8,-8},
			{2,-2},
			{3,-3},
			{4,-4},
			{5,-5},
			{6,-6},
			{7,-7},
			{8,-8},
			// rook moves
			{0,2},
			{0,3},
			{0,4},
			{0,5},
			{0,6},
			{0,7},
			{0,8},
			{2,0},
			{3,0},
			{4,0},
			{5,0},
			{6,0},
			{7,0},
			{8,0},
			{0,-2},
			{0,-3},
			{0,-4},
			{0,-5},
			{0,-6},
			{0,-7},
			{0,-8},
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
