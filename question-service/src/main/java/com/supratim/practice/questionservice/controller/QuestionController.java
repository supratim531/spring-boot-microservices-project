package com.supratim.practice.questionservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supratim.practice.questionservice.entity.Question;
import com.supratim.practice.questionservice.service.QuestionService;

@RestController
@RequestMapping("/api/v1/question")
public class QuestionController {
	private final QuestionService questionService;

	public QuestionController(QuestionService questionService) {
		super();
		this.questionService = questionService;
	}

	@PostMapping
	public Question saveQuestion(@RequestBody Question question) {
		return questionService.saveQuestion(question);
	}

	@GetMapping
	public List<Question> findAllQuestions() {
		return questionService.findAllQuestions();
	}

	@GetMapping("/{id}")
	public Question findQuestionById(@PathVariable(name = "id") Long questionId) {
		return questionService.findQuestionById(questionId);
	}

	@GetMapping("/quiz/{id}")
	public List<Question> findQuestionsByQuizId(@PathVariable(name = "id") Long quizId) {
		return questionService.findQuestionsByQuizId(quizId);
	}
}
