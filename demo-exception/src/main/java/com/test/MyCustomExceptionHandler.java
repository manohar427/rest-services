package com.test;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyCustomExceptionHandler{

	
	
	/*@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> wentWrong1(Exception e) {
		ErrorResponse er = new ErrorResponse("<<<<<<<<<<<<<<<<<<<Went wrong-1>>>>>>>>>>>>>>>>>>>", e.getMessage());
		return new ResponseEntity<ErrorResponse>(er, new HttpHeaders(), HttpStatus.OK);
	}*/
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<ErrorResponse> wentWrong(NullPointerException e) {
		ErrorResponse er = new ErrorResponse("<<<<<<<<<<<<<<<<<<<Went wrong>>>>>>>>>>>>>>>>>>>", e.getMessage());
		return new ResponseEntity<ErrorResponse>(er, new HttpHeaders(), HttpStatus.OK);
	}
}