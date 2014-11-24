package tictactoe;

public class Player {

	private String name;
	
	public Player(String name) throws IllegalArgumentException {
		if(name == null || name.isEmpty() || name.length() > 25) {
			throw new IllegalArgumentException();
		} 
		this.name = name;
	}

}
