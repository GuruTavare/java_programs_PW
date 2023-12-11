package com.prowings.customexception;

public class InvalidCitizenException extends RuntimeException {

	public InvalidCitizenException() {
		super();
	}

	public InvalidCitizenException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidCitizenException(String message) {
		super(message);
	}

	public InvalidCitizenException(Throwable cause) {
		super(cause);
	}

}
