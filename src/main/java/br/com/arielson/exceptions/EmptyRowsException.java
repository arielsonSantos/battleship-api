package br.com.arielson.exceptions;

public class EmptyRowsException extends RuntimeException {

	public EmptyRowsException() {
		super("Cannot start a new game with empty rows");
	}
}
