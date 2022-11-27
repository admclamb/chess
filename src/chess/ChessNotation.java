package chess;
import java.util.HashMap;

public class ChessNotation {

  public static HashMap<String, String> parse(String move) {
    HashMap<String, String> moveMap = new HashMap<String, String>();
    // if the move involves a capture
    if (move.indexOf("x") > -1) {

    }  else {
      // if its not a pawn move
      if (move.length() > 2) {
        String pieceType = move.charAt(0) + "";
        String square = move.substring(2);
        moveMap.put("piece", pieceType);
        moveMap.put("square", square);
        return moveMap;
      } else {
        String square = move;
      }
    }
    return moveMap;
  }
}
