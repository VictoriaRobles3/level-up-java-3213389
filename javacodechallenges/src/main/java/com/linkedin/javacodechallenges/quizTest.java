package com.linkedin.javacodechallenges;

public class quizTest {
  public static void main(String[] args){
    Quiz quiz = new Quiz();
    quiz.addQuestion(new FRQuiz("Where are you from?", "Peru"));
    quiz.addQuestion(new MCQuiz("Where do you live?", "USA"));
    quiz.addQuestion(new TFQuiz("Do you have a pup?", "True"));
    int score = 0;
    for(Question question : quiz.getQuestions()){
      System.out.println("******************\n");
      question.getQuestion();
      question.addAnswer();
      if(question.checkAnswer()){
        System.out.println("CORRECT!!!");
        score++;
      }
      else{
        System.out.println("Try again T-T");
      }
      System.out.println("Your score is "+ score + "/" + quiz.getQuestions().size());
    }
    System.out.println("Your total score is ");
  }
}
