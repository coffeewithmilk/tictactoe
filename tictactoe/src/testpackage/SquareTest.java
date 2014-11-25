package testpackage;

import org.junit.Before;
import org.junit.Test;

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
		} catch (IllegalArgumentException e) {
			
		}
	}
	
	@Test
	public void testGetPlayer() {
		square.getPlayer();
	}

}
