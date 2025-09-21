package com.supratim.practice.quizservice;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.supratim.practice.quizservice.entity.Quiz;
import com.supratim.practice.quizservice.repository.QuizRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@EnableFeignClients
public class QuizServiceApplication {
	@Autowired
	private QuizRepository quizRepository;

	public static void main(String[] args) {
		SpringApplication.run(QuizServiceApplication.class, args);
	}

	@PostConstruct
	public void dumpQuizData() {
		Quiz quiz1 = Quiz.builder().quizTitle("Java Quiz").build();
		Quiz quiz2 = Quiz.builder().quizTitle("Python Quiz").build();
		Quiz quiz3 = Quiz.builder().quizTitle("Java Collection Quiz").build();
		Quiz quiz4 = Quiz.builder().quizTitle("Java Networking Quiz").build();
		quizRepository.saveAll(Arrays.asList(quiz1, quiz2, quiz3, quiz4));
	}
}
