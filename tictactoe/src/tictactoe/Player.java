package tictactoe;

public class Player {

	public Player(String name) throws IllegalArgumentException {
		if(name == null || name.isEmpty()) {
			throw new IllegalArgumentException();
		} 
		
	}

}
