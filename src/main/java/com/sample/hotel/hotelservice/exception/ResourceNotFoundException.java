package com.sample.hotel.hotelservice.exception;

public class ResourceNotFoundException extends RuntimeException {

	String message;

	public ResourceNotFoundException(String message) {
		super(message);
		this.message = message;
	}

	public ResourceNotFoundException() {
		super();
	}

}
