package br.com.arielson.exceptions;

public class NullRowsException extends RuntimeException {

	public NullRowsException() {
		super("Cannot start a new game with null rows");
	}
}
