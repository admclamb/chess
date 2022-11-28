package chess;
import java.util.HashMap;

public class ChessNotation {

  public static HashMap<String, String> parse(String move) {
    HashMap<String, String> moveMap = new HashMap<String, String>();
    // if the move involves a capture
    if (move.indexOf("x") > -1) {
      if (move.length() > 4) {
        String pieceType = move.charAt(0) + "";
        String square = move.substring(move.indexOf("x"));
      }
      String pieceType = move.charAt(0) + "";
      String square = move.substring(move.indexOf("x"));
      moveMap.put("toSquare", square);
    }  else {
      if (move.length() > 3) {
        // if its not a pawn move with piece specificity
        String pieceType = move.charAt(0) + "";
        String pieceSquare = move.charAt(1) + "";
        String square = move.substring(2);
        moveMap.put("piece", pieceType);
        moveMap.put("pieceSpecificty", pieceSquare);
        moveMap.put("toSquare", square);
      } else if (move.length() > 2) {
        // if its not a pawn move
        String pieceType = move.charAt(0) + "";
        String square = move.substring(2);
        moveMap.put("piece", pieceType);
        moveMap.put("toSquare", square);
        return moveMap;
      } else {
        // if its a pawn move
        String pieceType = "p";
        String square = move;
        moveMap.put("piece", pieceType);
        moveMap.put("toSquare", square);
      }
    }
    return moveMap;
  }
}
