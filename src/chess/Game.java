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
		board.init();
		turn = playerWhite;
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
		try {
			if (board.isValidMove(move)) {
				board.makeMove(move);
			} else {
				throw new IllegalStateException(move + "is not a valid move");
			}
		} catch(Exception error) {
			System.out.println(error);
		}
	}

}
