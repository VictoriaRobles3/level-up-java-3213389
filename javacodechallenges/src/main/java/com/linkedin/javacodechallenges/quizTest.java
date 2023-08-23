package com.linkedin.javacodechallenges;

public class quizTest {
  public static void main(String[] args){
    Quiz quiz = new Quiz();
    quiz.addQuestion(new FRQuiz("Where are you from?", "Peru"));
    quiz.addQuestion(new MCQuiz("Where do you live?", "USA"));
    quiz.addQuestion(new TFQuiz("Do you have a pup?", "True"));
    double score = 0;
    double total = 0;
    for(Question question : quiz.getQuestions()){
      System.out.println("******************\n");
      question.getQuestion();
      question.addAnswer();
      if(question.checkAnswer()){
        System.out.println("\nCorrect!");
        score++;
      }
      else{
        System.out.println("\nIncorrect");
      }
      System.out.println("Your score is "+ (int)score + "/" + quiz.getQuestions().size());
      total = (score / quiz.getQuestions().size()) * 100 ;
    }
    System.out.println("******************\n");
    System.out.printf("\nYOUR TOTAL SCORE: %.2f%%", total);
    if(total < 60){
      System.out.println("\nYOUR LETTER GRADE: F");
    }
    else if(total >= 60 && total < 70){
      System.out.println("\nYOUR LETTER GRADE: D");
    }
    else if(total >=70 && total < 80){
      System.out.println("\nYOUR LETTER GRADE: C");
    }
    else if(total >=80 && total < 90){
      System.out.println("\nYOUR LETTER GRADE: B");
    }
    else{
      System.out.println("\nYOUR LETTER GRADE: A");
    }
  }
}
