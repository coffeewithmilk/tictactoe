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
		try {
			player = new Player(null);
			fail();
		} catch(IllegalArgumentException e) {

		}
	}

	@Test
	public void constructorShoudlThrowOnEmpty() {
		try {
			player = new Player("");
			fail();
		} catch(IllegalArgumentException e) {

		}
	}



}
