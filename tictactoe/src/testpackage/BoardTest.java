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
		Square[][] input = createSquares(5, 4, false);
		constructShouldThrowOn(input);
	}

	@Test
	public void constructShouldThrowOnAnyArgElementNull() {
		Square[][] input = createSquares(3, 3, true);
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
		Board b = new Board(createSquares(3, 3, false));
		b.getWinner();
	}

	private Square[][] createSquares(int m, int n, boolean isElementsNull) {
		Square[][] input = new Square[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(isElementsNull) {
					input[i][j] = null;
				} else {
					input[i][j] = new Square();
				}
			}
		}
		return input;
	}

}
