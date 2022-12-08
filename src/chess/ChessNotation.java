package chess;
import java.util.HashMap;

public class ChessNotation {

  private static String getDestination(String move) {
    return move.substring(move.length() - 2);
  }

  private static String getPieceSpecificity(String move) {
    if (move.toLowerCase().indexOf("x") > -1) {
      return move.substring(1, (move.toLowerCase().indexOf("x") + 1));
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

  private static String getCapture(String move) {
    return move.substring(move.toLowerCase().indexOf("x"));
  }


  public static HashMap<String, String> parse(String move) {
    HashMap<String, String> moveMap = new HashMap<String, String>();
    moveMap.put("piece", getPiece(move));
    moveMap.put("specificity", getPieceSpecificity(move));
    moveMap.put("destination", getDestination(move));
    moveMap.put("capture", getCapture(move));
    return moveMap;
  }
}
