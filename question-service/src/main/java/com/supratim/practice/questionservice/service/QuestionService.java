package com.supratim.practice.questionservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.supratim.practice.questionservice.entity.Question;
import com.supratim.practice.questionservice.exception.NotFoundException;

@Service
public interface QuestionService {
	Question saveQuestion(Question question);

	List<Question> findAllQuestions();

	Question findQuestionById(Long questionId) throws NotFoundException;

	List<Question> findQuestionsByQuizId(Long quizId);
}
