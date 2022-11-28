package chess;
import java.util.Scanner;
import java.util.Map;
import static java.util.Map.entry;
public class TerminalView {
  Map<String, String> pieces;
  public static Scanner input = new Scanner(System.in);
  public TerminalView(String characterType) {
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

  public TerminalView() {
    pieces = Map.ofEntries(
      entry("wPawn", "P"),
      entry("wKing", "K"),
      entry("wRook", "R"),
      entry("wKnight", "N"),
      entry("wBishop", "B"),
      entry("wQueen", "Q"),
      entry("bPawn", "p"),
      entry("bKing", "k"),
      entry("bRook", "r"),
      entry("bKnight", "n"),
      entry("bBishop", "b"),
      entry("bQueen", "q")
    );
  }

  public static void main(String[] args) {
    TerminalView view = new TerminalView();
    Game game = new Game("White player", "Black player");
    
    while(!game.getGameOverStatus()) {
      view.renderBoard(game.getBoard());
      String move = view.move(game.getTurn());
      game.makeMove(move);
    }
    input.close();
  }

  public void renderBoard(Board boardInstance) {
    Square[][] board = boardInstance.getBoard();
    for(int rank=board.length - 1; rank>=0; rank--) {
      String outputLine = (rank + 1) + " ";
      for (int file=0; file < board.length; file++) {
        outputLine += " ";
        Square square = board[rank][file];
        if (square.isOccupied()) {
          String pieceName = square.getPiece().getName();
          outputLine += pieces.get(pieceName);
        } else {
          outputLine += ".";
        }
      }
      System.out.println(outputLine);
    }
    System.out.println("   ===============");
    System.out.println("   a b c d e f g h");
  }

  public String move(Player player) {
    System.out.println(player.getColor() + " move:");
    String move = input.nextLine();
    return move;
  }

}
