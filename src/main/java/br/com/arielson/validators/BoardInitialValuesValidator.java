package br.com.arielson.validators;

public abstract class BoardInitialValuesValidator {

	public void validate(Integer value) {
		if (value == null)
			throwNullValueException();
		
		if (value.equals(0))
			throwEmptyValueException();
		
		if (value < 0)
			throwNegativeValueException();
	}
	
	protected abstract void throwNullValueException();
	protected abstract void throwEmptyValueException();
	protected abstract void throwNegativeValueException();
}
