package com.supratim.practice.quizservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.supratim.practice.quizservice.entity.Quiz;

@Service
public interface QuizService {
	Quiz saveQuiz(Quiz quiz);

	List<Quiz> findAllQuizs();

	Quiz findQuizById(Long quizId);
}
