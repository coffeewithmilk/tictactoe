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
		try {
			square.setPlayer(null);
			fail();
		} catch (IllegalArgumentException e) {
			
		}
	}
	
	@Test
	public void testGetPlayer() {
		square.getPlayer();
	}

}
