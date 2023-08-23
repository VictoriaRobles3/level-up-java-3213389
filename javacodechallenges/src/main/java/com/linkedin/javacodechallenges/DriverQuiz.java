package com.linkedin.javacodechallenges;

import java.util.*;

public class DriverQuiz {
  public static void main(String[] args){
    QuizLO quiz = new QuizLO();

    quiz.addQuestion(new FRQuiz("What is you name?", "Victoria"));
    quiz.addQuestion(new MCQuiz("Who is the president?", "Joe Biden"));
    quiz.addQuestion(new TFQuiz("Is blue a primary color?", "True"));

    int score = 0;
    for(FRQuiz question : quiz.getQuestions()){
      question.getQuestion();
      question.addAnswer();
      if(question.checkAnswer()){
        System.out.println("Correct!");
        score++;
      }
      else{
        System.out.println("Incorrect");
      }
      System.out.println("Your total score is " + score + "/" + quiz.getQuestions().size());
    }
  }
}
