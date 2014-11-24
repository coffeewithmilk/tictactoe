package tictactoe;

/**
 * 
 * @author DavidSjogren
 *
 */
public class Square {
	private Player player;

	public void setPlayer(Player player) throws IllegalArgumentException {
		if(player == null) {
			throw new IllegalArgumentException();
		}
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}

}
