package chess;

public class Game {
	private Board board;
	Player playerWhite;
	Player playerBlack;
	Boolean gameOver = false;
	Player turn;
	public Game(String whiteName, String blackName) {
		this.playerWhite = new Player(whiteName, "white");
		this.playerBlack = new Player(blackName, "black");
		this.board = Board.getInstance();
		this.init();
	}
	
	public void init() {
		this.board.init();
		this.turn = playerWhite;
	}

	public Boolean getGameOverStatus() {
		return gameOver;
	}

	public Board getBoard() {
		return board;
	}

	public Player getTurn() {
		return turn;
	}

	public void makeMove(String move) {
		if (board.isValidMove(move)) {

		}
	}

}
