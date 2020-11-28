package com.capgemini.employeepayrollapp.exceptionhelper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.capgemini.employeepayrollapp.service.EmployeeException;

public class PayrollExceptioHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<String> handleEmployeeException(EmployeeException empException){
		return new ResponseEntity<>(empException.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
