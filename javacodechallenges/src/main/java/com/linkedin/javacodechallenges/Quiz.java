package com.linkedin.javacodechallenges;
import java.util.*;

public class Quiz{
  private List<Question> listOfQuestions;
  
  public Quiz(){
    listOfQuestions = new ArrayList<>();
  }

  public void addQuestion(Question question){
    listOfQuestions.add(question);
  }

  public List<Question> getQuestions(){
    return listOfQuestions;
  }
}
