package testpackage;

import static org.junit.Assert.*;

import org.junit.Test;

import tictactoe.Board;

public class BoardTest {
	private Board board;

	@Test
	public void constructShouldThrowOnNullArg() {
		try {
			board = new Board(null);
		} catch (IllegalArgumentException e) {

		}
	}

}
