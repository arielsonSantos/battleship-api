package br.com.arielson.validators;

import br.com.arielson.exceptions.EmptyRowsException;
import br.com.arielson.exceptions.NegativeRowsException;
import br.com.arielson.exceptions.NullRowsException;

public class RowValidator extends BoardInitialValuesValidator {
	
	public static void validateRow(Integer row) {
		new RowValidator().validate(row);
	}

	@Override
	protected void throwNullValueException() {
		throw new NullRowsException();
	}

	@Override
	protected void throwEmptyValueException() {
		throw new EmptyRowsException();
	}

	@Override
	protected void throwNegativeValueException() {
		throw new NegativeRowsException();
	}
}
