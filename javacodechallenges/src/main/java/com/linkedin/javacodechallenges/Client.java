package com.linkedin.javacodechallenges;

public class Client {
  
  public static void main(String[] args){
    QuizHandler chain = new MCQuiz(new FRQuiz(new TFQuiz(null)));
    chain.typeOfQuestion("FR");
    
  }
}
