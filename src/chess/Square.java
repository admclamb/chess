package chess;

public class Square {
	Piece piece;
	String color;
	public Square(String color) {
		this.color = color;
	}
	
	public void occupy(Piece piece) {
		this.piece = piece;
	}
	
	public Piece unoccupy() {
		Piece removedPiece = this.piece;
		this.piece = null;
		return removedPiece;
	}
}
