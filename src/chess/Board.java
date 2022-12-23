package chess;
import java.util.ArrayList;
import java.util.NoSuchElementException;
public class Board {
	private static Board board_instance = null;
	Square[][] board;
	String[] moves;
	private Board() {
		board = new Square[8][8];
		for (int row=0; row<8; row++) {
			for (int file=0; file<8; file++) {
//			check if even or odd efficiently
				if ((row & 1) == 0) {
					if ((file & 1) == 0) {
						board[row][file] = new Square("black");
					} else {
						board[row][file] = new Square("white");
					}
				} else {
					if ((file & 1) != 0) {
						board[row][file] = new Square("black");
					} else {
						board[row][file] = new Square("white");
					}
				}
			}
		}
		moves = new String[] {};
	}
	
	public static Board getInstance() {
		if (board_instance == null) {
			board_instance = new Board();
		}
		return board_instance;
	}

	public Square[][] getBoard() {
		return board;
	}

	public Boolean isValidMove(String move) {
		return true;
	}

	public ArrayList<Piece> findPiece(String notatedPiece) {
		ArrayList<Piece> pieces = new ArrayList<Piece>();
		for (int row=0; row<8; row++) {
			for (int file=0; file<8; file++) {
				if (board[row][file].isOccupied()) {
					Piece piece = board[row][file].getPiece();
					if (piece.getName() == notatedPiece) {
						pieces.add(piece);
					}
				}
			}
		}
		return pieces;
	}

	public ArrayList<Piece> piecesThatHaveMove(Notation notatedMove) {
		ArrayList<Piece> pieces = new ArrayList<Piece>();
		ArrayList<Piece> foundPieces = findPiece(notatedMove.getPiece());
		if (foundPieces.size() == 0) {
			throw new NoSuchElementException();
		} 
		for(Piece piece : foundPieces) {
				if (piece.hasMove(notatedMove.getDestination()));
		}
		return pieces;
	}

	public void makeMove(String move) {
		Notation notatedMove = ChessNotation.parse(move);
		String pieceToFind = notatedMove.getPiece();
		ArrayList<Piece> foundPieces = findPiece(pieceToFind);
		if (foundPieces.size() > 0) {

		}

	}

	public void updatePiecePosition(int[] from, int[]to) {
		Piece piece = board[from[0]][from[1]].unoccupy();
		board[to[0]][to[1]].unoccupy();
		board[to[0]][to[1]].occupy(piece);
	}

	public Boolean checkCheckmate() {
		return false;
	}

	public void init() {
		//		initialize white pieces
		board[0][0].occupy(new Rook("white"));
		board[0][1].occupy(new Knight("white"));
		board[0][2].occupy(new Bishop("white"));
		board[0][3].occupy(new Queen("white"));
		board[0][4].occupy(new King("white"));
		board[0][5].occupy(new Bishop("white"));
		board[0][6].occupy(new Knight("white"));
		board[0][7].occupy(new Rook("white"));
		board[1][0].occupy(new Pawn("white"));
		board[1][1].occupy(new Pawn("white"));
		board[1][2].occupy(new Pawn("white"));
		board[1][3].occupy(new Pawn("white"));
		board[1][4].occupy(new Pawn("white"));
		board[1][5].occupy(new Pawn("white"));
		board[1][6].occupy(new Pawn("white"));
		board[1][7].occupy(new Pawn("white"));
		//		initialize black pieces
		board[7][0].occupy(new Rook("black"));
		board[7][1].occupy(new Knight("black"));
		board[7][2].occupy(new Bishop("black"));
		board[7][3].occupy(new Queen("black"));
		board[7][4].occupy(new King("black"));
		board[7][5].occupy(new Bishop("black"));
		board[7][6].occupy(new Knight("black"));
		board[7][7].occupy(new Rook("black"));
		board[6][0].occupy(new Pawn("black"));
		board[6][1].occupy(new Pawn("black"));
		board[6][2].occupy(new Pawn("black"));
		board[6][3].occupy(new Pawn("black"));
		board[6][4].occupy(new Pawn("black"));
		board[6][5].occupy(new Pawn("black"));
		board[6][6].occupy(new Pawn("black"));
		board[6][7].occupy(new Pawn("black"));
		// fill empty squares
		for (int row=2; row<6; row++) {
			for (int file=0; file<8; file++) {
				if ((row & 1) == 0) {
					if ((file & 1) == 0) {
						board[row][file] = new Square("black");
					} else {
						board[row][file] = new Square("white");
					}
				} else {
					if ((file & 1) == 0) {
						board[row][file] = new Square("white");
					} else {
						board[row][file] = new Square("black");
					}
				}
			}
		}
	}
}
