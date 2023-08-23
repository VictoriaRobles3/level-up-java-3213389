package com.linkedin.javacodechallenges;
import java.util.*;
public class FRQuiz extends Question{

  public String studentAnswer;
  Scanner in = new Scanner(System.in);

  public FRQuiz(String question, String answer){
    super(question, answer);
  }

  public void addAnswer() {
    System.out.println("Input your answer: ");
    studentAnswer = in.nextLine();
  }

  public boolean checkAnswer() {
    return studentAnswer.equalsIgnoreCase(this.answer);
  }

  public void getQuestion() {
    System.out.println(question);
  }
}