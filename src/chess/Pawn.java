package chess;

public class Pawn extends Piece {
	int points;
	public Pawn(String color) {
		super(color, "Pawn");
		this.points = 1;
	}
}
