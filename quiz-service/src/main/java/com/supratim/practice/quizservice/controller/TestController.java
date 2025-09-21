package com.supratim.practice.quizservice.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz-test")
public class TestController {
	@GetMapping("/health")
	public Map<String, Object> health() {
		var response = new LinkedHashMap<String, Object>();
		response.put("port", 8888);
		response.put("message", "Quiz service is up and running😁");
		return response;
	}
}
