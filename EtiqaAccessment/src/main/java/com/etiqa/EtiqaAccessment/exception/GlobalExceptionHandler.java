package com.etiqa.EtiqaAccessment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
public class GlobalExceptionHandler {	
	 @ExceptionHandler(ResourceNotFoundException.class)
	    @ResponseStatus(HttpStatus.NOT_FOUND)
	    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex) {
	        ErrorResponse error = new ErrorResponse("Not Found", ex.getMessage());
	        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	    }
	 
	 
	 
}
