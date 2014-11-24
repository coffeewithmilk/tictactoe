package tictactoe;

import javax.swing.JPanel;

/**
 * 
 * @author DavidSjogren
 *
 */
public class Square extends JPanel {
	private Player player;
	private final int SIZE = 190;

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
