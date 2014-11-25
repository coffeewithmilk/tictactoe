package tictactoe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JPanel;

public class Board extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5352070910719656881L;
	private Square[][] squares;
	private final int SIZE = 600;

	public Board(Square[][] squares) throws IllegalArgumentException {
		if(squares == null || squares.length != 3) {			
			throw new IllegalArgumentException();
		}
		for(int i = 0; i < squares.length; i++) {
			if(squares[i].length != 3) {
				throw new IllegalArgumentException();
			}
			for(int j = 0; j < squares[i].length; j++) {
				if(squares[i][j] == null) {
					throw new IllegalArgumentException();
				}
			}
		}

		this.squares = squares;		
		setupPanel();

	}
	
	private void setupPanel() {
		this.setPreferredSize(new Dimension(SIZE, SIZE));
		this.setBackground(Color.gray);
		for(int i = 0; i < squares.length; i++) {
			for(int j = 0; j < squares[i].length; j++) {
				add(squares[i][j]);
			}
		}
	}

	public Player getWinner() {
		for(int i = 0; i < squares.length; i++) {

			Player p_1 = getWinnerOfRow(new Point(i, 0), new Point(i, 1), new Point(i, 2));
			Player p_2 = getWinnerOfRow(new Point(0, i), new Point(1, i), new Point(2, i));
			if(p_1 != null) {
				return p_1;
			} else if (p_2 != null) {
				return p_2;
			}

		}
		
		Player p_1 = getWinnerOfRow(new Point(0, 0), new Point(1, 1), new Point(2, 2));
		Player p_2 = getWinnerOfRow(new Point(2, 0), new Point(1, 1), new Point(0, 2));
		if(p_1 != null) {
			return p_1;
		} else if (p_2 != null) {
			return p_2;
		}
		
		return null;
	}

	private Player getWinnerOfRow(Point p_1, Point p_2, Point p_3) {
		Player player_p_1 = squares[p_1.x][p_1.y].getPlayer();
		Player player_p_2 = squares[p_2.x][p_2.y].getPlayer();
		Player player_p_3 = squares[p_3.x][p_3.y].getPlayer();
		if(player_p_1 == null || player_p_2 == null || player_p_3 == null) {
			return null;
		}
		if(player_p_1.equals(player_p_2) && player_p_1.equals(player_p_3)) {
			return player_p_1;
		}
		return null;		
	}

}
