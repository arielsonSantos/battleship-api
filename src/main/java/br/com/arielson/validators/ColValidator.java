package br.com.arielson.validators;

import br.com.arielson.exceptions.EmptyColsException;
import br.com.arielson.exceptions.NegativeColsException;
import br.com.arielson.exceptions.NullColsException;

public class ColValidator extends BoardInitialValuesValidator {
	
	public static void validateCol(Integer row) {
		new ColValidator().validate(row);
	}

	@Override
	protected void throwNullValueException() {
		throw new NullColsException();
	}

	@Override
	protected void throwEmptyValueException() {
		throw new EmptyColsException();
	}

	@Override
	protected void throwNegativeValueException() {
		throw new NegativeColsException();
	}
}
