package testpackage;

import static org.junit.Assert.fail;

import org.junit.Test;

import tictactoe.Board;
import tictactoe.Square;

public class BoardTest {
	private Board board;

	@Test
	public void constructShouldThrowOnNullArg() {
		try {
			board = new Board(null);
		} catch (IllegalArgumentException e) {

		}
	}

	@Test
	public void constructShouldThrowOnWrongSizeOfInputArray() {
		Square[][] input = new Square[5][4];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				input[i][j] = new Square();
			}
		}
		try {
			board = new Board(input);
			fail();
		} catch (IllegalArgumentException e) {

		}
	}

}
