package testpackage;

import static org.junit.Assert.fail;

import org.junit.Test;

import tictactoe.Board;
import tictactoe.Square;

public class BoardTest {
	private Board board;

	@Test
	public void constructShouldThrowOnNullArg() {
		constructShouldThrowOn(null);
	}

	@Test
	public void constructShouldThrowOnWrongSizeOfInputArray() {
		Square[][] input = new Square[5][4];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				input[i][j] = new Square();
			}
		}
		constructShouldThrowOn(input);
	}
	
	private void constructShouldThrowOn(Square[][] input) {
		try {
			board = new Board(input);
			fail();
		} catch (IllegalArgumentException e) {

		}
	}
	
	@Test
	public void testGetWinner() {	
		Board b = createBoard();
		b.getWinner();
	}
	
	private Board createBoard() {
		Square[][] input = new Square[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				input[i][j] = new Square();
			}
		}
		return new Board(input);
	}

}
