package sorryGame;

import java.awt.Color;
import sorryGame.Deck.Card;

abstract public class Player {
	
	//reference to the board
	protected GameBoard board;

	private String name;
	private String color;

	abstract void move(Card card);
	
	public Player(GameBoard board){
		this.board = board;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
