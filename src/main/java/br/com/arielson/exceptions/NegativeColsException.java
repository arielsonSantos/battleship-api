package br.com.arielson.exceptions;

public class NegativeColsException extends RuntimeException {

	public NegativeColsException() {
		super("Cannot start a new game with negative cols");
	}
}
