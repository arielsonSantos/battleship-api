package br.com.arielson;

import java.util.Arrays;

import br.com.arielson.validators.ColValidator;
import br.com.arielson.validators.PlayerValidator;
import br.com.arielson.validators.RowValidator;

public class BattleShipGame {
	
	private String[][] board;
	
	public static void main(String[] args) {
		
	}

	public String[][] startGame(Integer rows, Integer cols, Integer players) {
		validateInitialValues(rows, cols, players);
		populateBoard(rows, cols);
			
		return board;
	}

	private void validateInitialValues(Integer rows, Integer cols, Integer players) {
		RowValidator.validateRow(rows);
		ColValidator.validateCol(cols);
		PlayerValidator.validatePlayer(players);
	}
	
	private void populateBoard(Integer rows, Integer cols) {
		board = new String[rows][cols];
		Arrays.stream(board).forEach(row -> Arrays.fill(row, " "));
		System.out.println(Arrays.deepToString(board));
	}
}
