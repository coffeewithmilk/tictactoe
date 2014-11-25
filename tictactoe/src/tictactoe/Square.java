package tictactoe;

import java.awt.Dimension;

import javax.swing.JPanel;

/**
 * 
 * @author DavidSjogren
 *
 */
public class Square extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5686615023229738422L;
	private Player player;
	private final int SIZE = 190;

	public void setPlayer(Player player) throws IllegalArgumentException {
		if(player == null) {
			throw new IllegalArgumentException();
		}
		this.player = player;
		setupPanel();
	}
	
	private void setupPanel() {
		this.setPreferredSize(new Dimension(SIZE, SIZE));
	}

	public Player getPlayer() {
		return player;
	}

}
