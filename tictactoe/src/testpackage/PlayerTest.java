package testpackage;

import static org.junit.Assert.fail;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

import tictactoe.Player;

public class PlayerTest {
	private Player player;

	private final String EMPTY_STRING = "";
	private final String STRING_26_LENGTH = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	@Before
	public void setup() {
		player = new Player("FOO_FUU");
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

	@Test
	public void setColorShouldBeRedOrBlue() {
		setColorShouldThrowOn(Color.white);
	}

	@Test
	public void setColorShouldThrowOnNull() {
		setColorShouldThrowOn(null);
	}
	
	@Test
	public void testGetColor() {
		player.getColor();
	}
	
	private void setColorShouldThrowOn(Color input) {
		try {
			player.setColor(input);
		} catch (IllegalArgumentException e) {

		}
	}

	@Test
	public void testGetName() {
		player.getName();
	}

	private void constructorShouldThrowOn(String input) {
		try {
			new Player(input);
			fail();
		} catch(IllegalArgumentException e) {

		}
	}



}
