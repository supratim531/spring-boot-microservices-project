package com.supratim.practice.questionservice.exceptionhandler;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.supratim.practice.questionservice.exception.NotFoundException;

@RestControllerAdvice
public class ApiExceptionHandler {
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<Map<String, Object>> handleNotFound(NotFoundException e) {
		Map<String, Object> errorResponse = new LinkedHashMap<>();
		errorResponse.put("status", 404);
		errorResponse.put("message", e.getMessage());
		errorResponse.put("stackTrace", e.getStackTrace());
		return ResponseEntity.status(404).body(errorResponse);
	}
}
