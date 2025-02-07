package com.sample.hotel.hotelservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sample.hotel.hotelservice.payload.ResponseError;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ResponseError> resourceNotFoundHandler(ResourceNotFoundException ex) {

		ResponseError errorResponse = ResponseError.builder().message(ex.getMessage()).success(false)
				.status(HttpStatus.NOT_FOUND).build();

		return new ResponseEntity<ResponseError>(errorResponse, HttpStatus.NOT_FOUND);

	}

}
