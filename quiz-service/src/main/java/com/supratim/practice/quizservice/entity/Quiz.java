package com.supratim.practice.quizservice.entity;

import java.util.List;

import com.supratim.practice.quizservice.model.Question;

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
@Table(name = "quiz")
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long quizId;
	private String quizTitle;
	transient private List<Question> questions;
}
