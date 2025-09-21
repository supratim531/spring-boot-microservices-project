package com.supratim.practice.quizservice.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.supratim.practice.quizservice.entity.Quiz;
import com.supratim.practice.quizservice.repository.QuizRepository;
import com.supratim.practice.quizservice.service.QuestionClient;
import com.supratim.practice.quizservice.service.QuizService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {
	private final QuizRepository quizRepository;
	private final QuestionClient questionClient;

	@Override
	public Quiz saveQuiz(Quiz quiz) {
		return quizRepository.save(quiz);
	}

	@Override
	public List<Quiz> findAllQuizs() {
		List<Quiz> quizs = quizRepository.findAll();
		quizs = quizs.stream().map(quiz -> {
			quiz.setQuestions(questionClient.findQuestionsByQuizId(quiz.getQuizId()));
			return quiz;
		}).collect(Collectors.toList());

		return quizs;
	}

	@Override
	public Quiz findQuizById(Long quizId) {
		Quiz quiz = quizRepository.findById(quizId)
				.orElseThrow(() -> new RuntimeException("No quiz found with id " + quizId));
		quiz.setQuestions(questionClient.findQuestionsByQuizId(quizId));

		return quiz;
	}
}
