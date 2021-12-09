package br.com.arielson.exceptions;

public class InvalidNumberOfPlayersException extends RuntimeException {

	public InvalidNumberOfPlayersException() {
		super("Cannot start a new game with invalid number of players. Valid numbers are 1 or 2");
	}
}
