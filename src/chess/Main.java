package chess;

public class Main {

  public static void main(String[] args) {
    Game game = new Game("player 1", "player 2");
    game.init();
    System.out.println("Starting game");
  }
}