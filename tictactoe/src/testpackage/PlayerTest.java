package testpackage;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import tictactoe.Player;

public class PlayerTest {
	private Player player;
	
	private final String EMPTY_STRING = "";
	private final String STRING_26_LENGTH = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	@Before
	public void setup() {

	}

	@Test
	public void constructorShouldThrowOnNull() {
		constructorShouldThrowOn(null);
	}

	@Test
	public void constructorShouldThrowOnEmpty() {
		constructorShouldThrowOn(EMPTY_STRING);
	}
	
	@Test
	public void constructorShouldThrowOnTooLong() {
		constructorShouldThrowOn(STRING_26_LENGTH);
	}
	
	private void constructorShouldThrowOn(String input) {
		try {
			player = new Player(input);
			fail();
		} catch(IllegalArgumentException e) {

		}
	}



}
