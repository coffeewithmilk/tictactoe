package testpackage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tictactoe.Player;
import tictactoe.Square;

public class SquareTest {
	private Square square;

	@Before
	public void setUp() {
		square = new Square();
	}

	@Test
	public void setPlayerShouldThrowOnNullArg() {
		setPlayerShouldThrowWhen(null);
	}

	@Test
	public void setPlayerShouldThrowWhenPlayerIsAlreadySet() {
		square.setPlayer(new Player("asdf"));
		setPlayerShouldThrowWhen(new Player("fda"));
	}

	private void setPlayerShouldThrowWhen(Player input) {
		try {
			square.setPlayer(input);
			fail();
		} catch (IllegalArgumentException e) {

		}
	}
	
	@Test
	public void testGetPlayer() {
		square.getPlayer();
	}

}
