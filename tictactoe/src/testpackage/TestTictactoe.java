package testpackage;

import org.junit.Test;

import tictactoe.Player;
import tictactoe.Tictactoe;

public class TestTictactoe {

	@Test
	public void testStart() {
		new Tictactoe().start();
	}
	
	@Test
	public void testWinning() {
		Player p = new Player("asdf");
		new Tictactoe().winGame(p);
	}

}
