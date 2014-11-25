package tictactoe;

import java.awt.Color;

public class Player {

	private String name;
	private Color color;

	public Player(String name) throws IllegalArgumentException {
		if(name == null || name.isEmpty() || name.length() > 25) {
			throw new IllegalArgumentException();
		} 
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setColor(Color c) throws IllegalArgumentException {
		if(c == null || !c.equals(Color.blue) || !c.equals(Color.red)) {
			throw new IllegalArgumentException("Can only be Color.blue or Color.red");
		}
		this.color = c;
	}

}
