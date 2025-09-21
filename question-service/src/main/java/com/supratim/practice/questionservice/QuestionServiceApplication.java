package com.supratim.practice.questionservice;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.supratim.practice.questionservice.entity.Question;
import com.supratim.practice.questionservice.repository.QuestionRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class QuestionServiceApplication {
	@Autowired
	private QuestionRepository questionRepository;

	public static void main(String[] args) {
		SpringApplication.run(QuestionServiceApplication.class, args);
	}

	@PostConstruct
	public void dumpQuestionData() {
		Question question1 = Question.builder().question("What is java?").quizId(1L).build();
		Question question2 = Question.builder().question("What is OOP?").quizId(1L).build();
		Question question3 = Question.builder().question("What is python?").quizId(2L).build();
		Question question4 = Question.builder().question("What is collection framework?").quizId(3L).build();
		questionRepository.saveAll(Arrays.asList(question1, question2, question3, question4));
	}
}
