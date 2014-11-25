package tictactoe;

import java.awt.Color;
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
import javax.swing.UnsupportedLookAndFeelException;


public class Tictactoe {


	private Player player1;
	private Player player2;
	private Player currentPlayer;
	private Board board;
	private Square[][] squares;
	private GameGUI gg;
	

	private class GameGUI extends JFrame {

		/**
		 * 
		 */
		private static final long serialVersionUID = 114539776250267532L;

		GameGUI() {
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Tic-tac-toe between " + player1.getName() + " and " + player2.getName());
			setResizable(false);
			setLocation(200,100);
			
			try {
				UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch (ClassNotFoundException | InstantiationException
					| IllegalAccessException | UnsupportedLookAndFeelException e1) {
				e1.printStackTrace();
			}
			
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
			winGame(p);
		}
	}
	
	private void setMouseListenersForSquares(Square[][] sqs) {
		for(int i = 0; i < sqs.length; i++) {
			for(int j = 0; j < sqs[i].length; j++) {
				Square s = sqs[i][j];
				s.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent e) {
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						newPlayerTurn(s);
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						
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
		player1.setColor(Color.blue);
		player2 = new Player(player2_name);
		player2.setColor(Color.red);
		currentPlayer = player1;
		squares = createSquares(3, 3);
		setMouseListenersForSquares(squares);
		board = new Board(squares);
		gg = new GameGUI();
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
			setLocation(200, 100);

			try {
				UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch (ClassNotFoundException | InstantiationException
					| IllegalAccessException | UnsupportedLookAndFeelException e1) {
				e1.printStackTrace();
			}
			
			JTextField player_1 = new JTextField("Player 1");
			player_1.setPreferredSize(new Dimension(200, 50));
			JTextField player_2 = new JTextField("Player 2");
			player_2.setPreferredSize(new Dimension(200, 50));

			JButton start = new JButton("Start");
			start.setPreferredSize(new Dimension(200, 50));

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
			simpleBackPan.setPreferredSize(new Dimension(300, 200));
			simpleBackPan.setBackground(Color.white);
			simpleBackPan.add(player_1);
			simpleBackPan.add(player_2);
			simpleBackPan.add(start);
			add(simpleBackPan);

			pack();
			setVisible(true);
		}

	}

	public void winGame(Player p) {
		JOptionPane.showMessageDialog(null, "Player: '" + p.getName() + "' won! Congratulations!");
		gg.dispose();
		start();
	}
}
