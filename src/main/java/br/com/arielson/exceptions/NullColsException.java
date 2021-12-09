package br.com.arielson.exceptions;

public class NullColsException extends RuntimeException {

	public NullColsException() {
		super("Cannot start a new game with null cols");
	}
}
