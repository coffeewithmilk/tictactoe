package tictactoe;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;


public class Tictactoe {


	private Player player1;
	private Player player2;
	private Player currentPlayer;
	private Board board;
	private Square[][] squares;

	private class GameGUI extends JFrame {

		/**
		 * 
		 */
		private static final long serialVersionUID = 114539776250267532L;

		GameGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Tic-tac-toe between " + player1.getName() + " and " + player2.getName());
			setResizable(false);

			
			
			add(board);		

			pack();
			setVisible(true);
		}

	}
	
	private void newPlayerTurn(Square s) {
		s.setPlayer(currentPlayer);
		if(currentPlayer.equals(player1)) {
			currentPlayer = player2;
		} else {
			currentPlayer = player1;
		}
		Player p = board.getWinner();
		if(p != null) {
			//winGame(p);
		}
	}
	
	private void setMouseListenersForSquares(Square[][] sqs) {
		for(int i = 0; i < sqs.length; i++) {
			for(int j = 0; j < sqs[i].length; j++) {
				Square s = sqs[i][j];
				s.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						newPlayerTurn(s);
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
				});
			}
		}
	}


	public void start() {
		new NamePlayersGUI();
	}

	private void startGame(String player1_name, String player2_name) {
		player1 = new Player(player1_name);
		player2 = new Player(player2_name);
		currentPlayer = player1;
		squares = createSquares(3, 3);
		setMouseListenersForSquares(squares);
		board = new Board(squares);
		new GameGUI();
	}

	private Square[][] createSquares(int m, int n) {
		Square[][] input = new Square[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				input[i][j] = new Square();
			}
		}
		return input;
	}

	private class NamePlayersGUI extends JFrame {

		/**
		 * 
		 */
		private static final long serialVersionUID = -5321522361430622020L;

		NamePlayersGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Name the players");
			setResizable(false);

			JTextField player_1 = new JTextField("Player 1");
			JTextField player_2 = new JTextField("Player 2");

			JButton start = new JButton("Start");

			start.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String p_1, p_2;
					p_1 = player_1.getText();
					p_2 = player_2.getText();
					try {
						startGame(p_1, p_2);
						dispose();
					} catch (IllegalArgumentException ex) {
						System.err.println(ex.getMessage());
					}
				}
			});

			JPanel simpleBackPan = new JPanel();
			simpleBackPan.setPreferredSize(new Dimension(300, 300));

			simpleBackPan.add(player_1);
			simpleBackPan.add(player_2);
			simpleBackPan.add(start);
			add(simpleBackPan);

			pack();
			setVisible(true);
		}

	}

	public void winGame(Player p) {
	}
}
