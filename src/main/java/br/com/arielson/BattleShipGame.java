package br.com.arielson;

import br.com.arielson.exceptions.EmptyColsException;
import br.com.arielson.exceptions.EmptyRowsException;
import br.com.arielson.exceptions.InvalidNumberOfPlayersException;
import br.com.arielson.exceptions.NegativeColsException;
import br.com.arielson.exceptions.NegativeRowsException;
import br.com.arielson.exceptions.NullColsException;
import br.com.arielson.exceptions.NullRowsException;

public class BattleShipGame {
	
	private int[][] board;
	
	public static void main(String[] args) {
		
	}

	public int[][] startGame(Integer rows, Integer cols, Integer players) {
		validateRows(rows);
		validateCols(cols);
		validatePlayers(players);
		
		board = new int[rows][cols];
			
		return board;
	}

	private void validateRows(Integer rows) {
		if (rows == null)
			throw new NullRowsException();
		
		if (rows.equals(0))
			throw new EmptyRowsException();
		
		if (rows < 0)
			throw new NegativeRowsException();
	}
	
	private void validateCols(Integer cols) {
		if (cols == null)
			throw new NullColsException();
		
		if (cols.equals(0))
			throw new EmptyColsException();
		
		if (cols < 0)
			throw new NegativeColsException();
	}

	private void validatePlayers(Integer players) {
		if (players == null || (!players.equals(1) && !players.equals(2)))
			throw new InvalidNumberOfPlayersException();
	}
}
