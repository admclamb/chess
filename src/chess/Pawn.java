package chess;

public class Pawn extends Piece {
	int points;
	private int[][] possibleMoves;
	public Pawn(String color) {
		super(color, "Pawn");
		this.points = 1;
		this.possibleMoves = new int[][]{{0,1},{0,2}};
	}

	public int[][] getMoves() {
		return possibleMoves;
	}
}
