package testpackage;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import tictactoe.Player;

public class PlayerTest {
	private Player player;


	@Before
	public void setup() {

	}

	@Test
	public void constructorShouldThrowOnNull() {
		constructorShouldThrowOn(null);
	}

	@Test
	public void constructorShouldThrowOnEmpty() {
		constructorShouldThrowOn("");
	}
	
	private void constructorShouldThrowOn(String input) {
		try {
			player = new Player(input);
			fail();
		} catch(IllegalArgumentException e) {

		}
	}



}
