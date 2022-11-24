package chess;

public class Player {
	private String name;
	private String color;
	int wins;
	int loses;
	int draws;
	int gamesPlayed;
	public Player(String name, String color) {
		this.name = name;
		this.wins = 0;
		this.loses = 0;
		this.draws = 0;
		this.gamesPlayed = 0;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}
}
