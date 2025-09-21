package com.supratim.practice.quizservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supratim.practice.quizservice.entity.Quiz;
import com.supratim.practice.quizservice.service.QuizService;

@RestController
@RequestMapping("/api/v1/quiz")
public class QuizController {
	private final QuizService quizService;

	public QuizController(QuizService quizService) {
		super();
		this.quizService = quizService;
	}

	@PostMapping
	public Quiz saveQuiz(@RequestBody Quiz quiz) {
		return quizService.saveQuiz(quiz);
	}

	@GetMapping
	public List<Quiz> findAllQuizs() {
		return quizService.findAllQuizs();
	}

	@GetMapping("/{id}")
	public Quiz findQuizById(@PathVariable(name = "id") Long quizId) {
		return quizService.findQuizById(quizId);
	}
}
