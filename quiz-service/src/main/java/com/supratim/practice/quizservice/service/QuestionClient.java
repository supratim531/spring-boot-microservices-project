package com.supratim.practice.quizservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.supratim.practice.quizservice.model.Question;

@FeignClient(url = "http://localhost:9999/api/v1/question", value = "Question-Client")
public interface QuestionClient {
	@GetMapping("/quiz/{id}")
	List<Question> findQuestionsByQuizId(@PathVariable(name = "id") Long quizId);
}
