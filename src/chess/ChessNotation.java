package chess;
import java.util.HashMap;

public class ChessNotation {

  private static String getDestination(String move) {
    return move.substring(move.length() - 2);
  }

  private static String getPieceSpecificity(String move) {
    if (move.toLowerCase().indexOf("x") > -1) {
      return move.substring(1, (move.toLowerCase().indexOf("x")));
    } else {
      if (move.length() > 3) {
        if (move.length() == 4) {
          return move.charAt(1) + "";
        } else {
          return move.substring(1, 3);
        }
      }
    }
    return "";
  }

  private static String getPiece(String move) {
    return move.charAt(0) + "";
  }

  public static HashMap<String, String> parse(String move) {
    HashMap<String, String> moveMap = new HashMap<String, String>();
    // if move is a pawn move
    if (move.length() == 2) {
      moveMap.put("piece", "p");
      moveMap.put("specificity", "");
      moveMap.put("destination", getDestination(move));
      return moveMap;
    }
    moveMap.put("piece", getPiece(move));
    moveMap.put("specificity", getPieceSpecificity(move));
    moveMap.put("destination", getDestination(move));
    return moveMap;
  }
}
