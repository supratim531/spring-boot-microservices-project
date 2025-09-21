package com.supratim.practice.quizservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Question {
	private Long questionId;
	private String question;
	private Long quizId;
}
