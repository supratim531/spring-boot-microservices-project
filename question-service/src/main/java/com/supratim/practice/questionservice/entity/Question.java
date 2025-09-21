package com.supratim.practice.questionservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "question")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long questionId;
	private String question;
	private Long quizId;
}
