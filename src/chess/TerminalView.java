package chess;
import java.util.Map;
import static java.util.Map.entry;
public class TerminalView {
  Map<String, String> pieces;

  public TerminalView() {
    pieces = Map.ofEntries(
      entry("wPawn", "♙"),
      entry("wKing", "♔"),
      entry("wRook", "♖"),
      entry("wKnight", "♘"),
      entry("wBishop", "♗"),
      entry("wQueen", "♕"),
      entry("bPawn", "♟"),
      entry("bKing", "♚"),
      entry("bRook", "♜"),
      entry("bKnight", "♞"),
      entry("bBishop", "♝"),
      entry("bQueen", "♛")
    );
  }

  public static void main(String[] args) {
    Board board = Board.getInstance();
    board.init();
    TerminalView game = new TerminalView();
    game.renderBoard(board);
  }

  public void renderBoard(Board board) {
    String outputLine = "";
    for (int i=0; i<board.getBoard().length; i++) {
      Square[] rank = board.getBoard()[i];
      outputLine = (i + 1) + "";
      for(int file=0; file<rank.length; file++) {
        Square square = rank[file];
        if (square.isOccupied()) {
          String pieceName = square.getPiece().getName();
          outputLine += " " + pieces.get(pieceName) + " ";
        } else {
          outputLine += " . ";
        }
      }
      System.out.println(outputLine);
    }
    System.out.println("  a  b  c  d  e  f  g  h ");
   
  }
  
}
