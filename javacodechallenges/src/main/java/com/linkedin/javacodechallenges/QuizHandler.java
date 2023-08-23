package com.linkedin.javacodechallenges;

public abstract class QuizHandler {
  private QuizHandler next;

  public QuizHandler(QuizHandler next){
    this.next = next;
  }
  
  public void typeOfQuestion(String questionType){
    if(next != null){
      next.typeOfQuestion(questionType);
    }
  }
}
