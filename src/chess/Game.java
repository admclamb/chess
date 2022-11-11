package chess;

public class Game {
	Board board;
	Player playerWhite;
	Player playerBlack;
	public Game(String whiteName, String blackName) {
		this.playerWhite = new Player(whiteName);
		this.playerBlack = new Player(blackName);
		this.board = Board.getInstance();
	}
	
	public void init() {
		this.board.init();
	}
}
