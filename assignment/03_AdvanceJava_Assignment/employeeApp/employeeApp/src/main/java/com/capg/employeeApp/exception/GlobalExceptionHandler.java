package com.capg.employeeApp.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalExceptionHandler {

	// Company Exception
	@ExceptionHandler(CompanyNotFoundException.class)
	public ResponseEntity<Map<String, String>> handleCompanyException(
			CompanyNotFoundException ex) {

		Map<String, String> error = new HashMap<>();
		error.put("error", ex.getMessage());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}

	// Employee Exception
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Map<String, String>> handleEmployeeException(
			EmployeeNotFoundException ex) {

		Map<String, String> error = new HashMap<>();
		error.put("error", ex.getMessage());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}

	// Validation Exception
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleValidationErrors(
			MethodArgumentNotValidException ex) {

		Map<String, String> errors = new HashMap<>();

		ex.getBindingResult().getFieldErrors().forEach(error ->
			errors.put(error.getField(), error.getDefaultMessage())
		);

		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}

	// Arithmetic Exception
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<String> handleArithmeticException(ArithmeticException ex) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
}