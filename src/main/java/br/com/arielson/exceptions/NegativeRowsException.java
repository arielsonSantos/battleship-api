package br.com.arielson.exceptions;

public class NegativeRowsException extends RuntimeException {

	public NegativeRowsException() {
		super("Cannot start a new game with negative rows");
	}
}
