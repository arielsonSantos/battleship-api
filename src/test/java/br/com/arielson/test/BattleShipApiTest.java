package br.com.arielson.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.arielson.BattleShipGame;
import br.com.arielson.exceptions.EmptyColsException;
import br.com.arielson.exceptions.EmptyRowsException;
import br.com.arielson.exceptions.InvalidNumberOfPlayersException;
import br.com.arielson.exceptions.NegativeColsException;
import br.com.arielson.exceptions.NegativeRowsException;
import br.com.arielson.exceptions.NullColsException;
import br.com.arielson.exceptions.NullRowsException;

class BattleShipApiTest {

	BattleShipGame game;

	@BeforeEach
	void setup() {
		game = new BattleShipGame();
	}

	@Test
	void shouldThrowExceptionForNewGameWithNullRows() {
		assertThrows(NullRowsException.class, () -> game.startGame(null, 0, 0));
	}

	@Test
	void shouldThrowExceptionForNewGameWithEmptyRows() {
		assertThrows(EmptyRowsException.class, () -> game.startGame(0, 0, 0));
	}

	@Test
	void shouldThrowExceptionForNewGameWithNegativeRows() {
		assertThrows(NegativeRowsException.class, () -> game.startGame(-1, 0, 0));
	}

	@Test
	void shouldThrowExceptionForNewGameWithNullCols() {
		assertThrows(NullColsException.class, () -> game.startGame(1, null, 0));
	}

	@Test
	void shouldThrowExceptionForNewGameWithEmptyCols() {
		assertThrows(EmptyColsException.class, () -> game.startGame(1, 0, 0));
	}

	@Test
	void shouldThrowExceptionForNewGameWithNegativeCols() {
		assertThrows(NegativeColsException.class, () -> game.startGame(1, -1, 0));
	}

	@Test
	void shouldThrowExceptionForNewGameWithNullPlayers() {
		assertThrows(InvalidNumberOfPlayersException.class, () -> game.startGame(1, 1, null));
	}

	@Test
	void shouldThrowExceptionForNewGameWithEmptyPlayers() {
		assertThrows(InvalidNumberOfPlayersException.class, () -> game.startGame(1, 1, 0));
	}

	@Test
	void shouldThrowExceptionForNewGameWithNegativePlayers() {
		assertThrows(InvalidNumberOfPlayersException.class, () -> game.startGame(1, 1, -1));
	}

	@Test
	void shouldThrowExceptionForNewGameWithNumberOfPlayersDifferentFrom1Or2() {
		assertThrows(InvalidNumberOfPlayersException.class, () -> game.startGame(1, 1, 3));
	}

	@Test
	void shouldStartGameWith1Row1Col1Player() {
		assertArrayEquals(new String[][] { { " " } }, game.startGame(1, 1, 1));
	}
}
