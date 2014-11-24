package tictactoe;

import javax.swing.JPanel;

public class Board extends JPanel {
	private Square[][] squares;

	public Board(Square[][] squares) throws IllegalArgumentException {
		if(squares == null || squares.length != 3) {			
			throw new IllegalArgumentException();
		}
		for(int i = 0; i < squares.length; i++) {
			if(squares[i].length != 3) {
				throw new IllegalArgumentException();
			}
		}
	
	}

	public Player getWinner() {
		return new Player("asdf");
	}

}
