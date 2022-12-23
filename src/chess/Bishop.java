package chess;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class Bishop extends Piece {
	int points;
	public Bishop(String color) {
		super(color, "Bishop", possibleMoves);
		this.points = 3;

	}

}
