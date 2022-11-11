package chess;

public class Player {
	String name;
	int wins;
	int loses;
	int draws;
	int gamesPlayed;
	public Player(String name) {
		this.name = name;
		this.wins = 0;
		this.loses = 0;
		this.draws = 0;
		this.gamesPlayed = 0;
	}
}
