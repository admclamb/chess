package chess;

public class Queen extends Piece {
	int points;
	public Queen(String color) {
		super(color, "Queen");
		this.points = 9;
	}
}
