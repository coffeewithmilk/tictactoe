package tictactoe;

import javax.swing.JPanel;

public class Board extends JPanel {
	private final int SIZE = 190;

	public Board(Square[][] squares) throws IllegalArgumentException {
		if(squares == null) {
			throw new IllegalArgumentException();
		}

	}



}
