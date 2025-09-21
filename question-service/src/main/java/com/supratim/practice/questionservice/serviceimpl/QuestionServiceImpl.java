package com.supratim.practice.questionservice.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.supratim.practice.questionservice.entity.Question;
import com.supratim.practice.questionservice.exception.NotFoundException;
import com.supratim.practice.questionservice.repository.QuestionRepository;
import com.supratim.practice.questionservice.service.QuestionService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {
	private final QuestionRepository questionRepository;

	@Override
	public Question saveQuestion(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public List<Question> findAllQuestions() {
		return questionRepository.findAll();
	}

	@Override
	public Question findQuestionById(Long questionId) throws NotFoundException {
		return questionRepository.findById(questionId)
				.orElseThrow(() -> new NotFoundException("No question found with id " + questionId));
	}

	@Override
	public List<Question> findQuestionsByQuizId(Long quizId) {
		return questionRepository.findByQuizId(quizId);
	}
}
