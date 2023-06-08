package com.danielcristianoti.controller.Excepetion;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.danielcristianoti.services.Exceptions.ObjectException;

@ControllerAdvice
public class ControllerException {

	@ExceptionHandler(ObjectException.class)
	public ResponseEntity<Error> objectNotFound(ObjectException e, HttpServletRequest request) {
		Error error = new Error(HttpStatus.NOT_FOUND.value(), System.currentTimeMillis(), e.getMessage());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}

}
