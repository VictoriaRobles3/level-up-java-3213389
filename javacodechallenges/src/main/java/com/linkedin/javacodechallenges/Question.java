package com.linkedin.javacodechallenges;
import java.util.*;

public class Question implements QuizInterface{
  protected String question;
  protected String answer;

  public String studentAnswer;
  Scanner in = new Scanner(System.in);

  public Question(String question, String answer){
    this.question = question.toUpperCase();
    this.answer = answer;
  }

  public void getQuestion(){
    System.out.println(question);
  }

  public void addAnswer() {
  }

  public boolean checkAnswer() {
    return  studentAnswer.equalsIgnoreCase(this.answer);
  }

}
