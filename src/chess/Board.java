package chess;

public class Board {
	private static Board board_instance = null;
	Square[][] board;
	
	private Board() {
//		initialize empty squares on board
		for (int row=0; row<8; row++) {
			for (int file=0; file<8; file++) {
//				check if even or odd efficiently
				if ((row & 1) == 0) {
					if ((file & 1) == 0) {
						this.board[row][file].add(new Square("black"));
					} else {
						this.board[row][file].add(new Square("White"));
					}
				}
			}
		}
	}
	
	public static Board getInstance() {
		if (board_instance == null) {
			board_instance = new Board();
		}
		return board_instance;
	}
	
	public void init() {
//		initialize white pieces
		for (int i=0; i<=1; i++) {
			for (int j=0; j<=8; j++) {
			}
		}
//		initialize black pieces
		for (int i=6; i<=7; i++) {
			for (int j=0; j<=8; j++) {
			}
		}
	}
}
