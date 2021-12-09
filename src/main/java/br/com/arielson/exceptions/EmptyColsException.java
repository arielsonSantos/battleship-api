package br.com.arielson.exceptions;

public class EmptyColsException extends RuntimeException {

	public EmptyColsException() {
		super("Cannot start a new game with empty cols");
	}
}
