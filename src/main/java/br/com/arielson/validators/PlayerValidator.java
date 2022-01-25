package br.com.arielson.validators;

import br.com.arielson.exceptions.InvalidNumberOfPlayersException;

public class PlayerValidator {

	public static void validatePlayer(Integer players) {
		if (players == null || (!players.equals(1) && !players.equals(2)))
			throw new InvalidNumberOfPlayersException();
	}
}
