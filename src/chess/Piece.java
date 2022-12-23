package chess;
import java.util.List;
import java.util.Map;
public class Piece {
	private String color;
	private String name;
	private List<Coordinate> possibleMoves;

	public Piece(String color, String name, List<Coordinate> possibleMoves) {
		this.color = color;
		this.name = color.charAt(0) + name;
		this.possibleMoves = possibleMoves;
	}

	public String getName() {
		return name;
	}

	public boolean hasMove(String move) {

	}


}
