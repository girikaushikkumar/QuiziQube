package com.microservices.quizservices.dao;

import com.microservices.quizservices.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
