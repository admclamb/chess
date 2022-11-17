package chess;

public class Piece {
	String color;
	String name;
	public Piece(String color, String name) {
		this.color = color;
		this.name = color.charAt(0) + name;
	}

	public String getName() {
		return name;
	}



}
