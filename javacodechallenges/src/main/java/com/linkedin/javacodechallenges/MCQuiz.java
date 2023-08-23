package com.linkedin.javacodechallenges;
import java.util.*;

public class MCQuiz extends Question {
  String[] questions = new String[5];
  Scanner in = new Scanner(System.in);

  public MCQuiz(String question, String answer) {
    super(question, answer);
  }

  public void addAnswer(){
    System.out.println("How many multiple choice answers will be added?: ");
    int num = in.nextInt();
    in.nextLine();
    questions = new String[num + 1];
    questions[0] = question;
    for (int i = 1; i <= num; i++) {
      System.out.println("Enter choice number " + i);
      questions[i] = in.nextLine();
    }
  }

  public boolean checkAnswer(){
    getQuestion();
    displayChoices();
    System.out.println("What is the correct answer?: **Input the option number**");
    int response = in.nextInt();
    boolean found = false;
    for (int i = 1; i < questions.length; i++) {
      if (questions[i].equalsIgnoreCase(answer) && i == response) {
        found = true;
      }
    }
    return found;
  }

  public void displayChoices(){
    for (int i = 0; i < questions.length; i++) {
      if (i > 0) {
        System.out.println("Option " + i + "\t" + questions[i]);
      }
    }
  }

  public static void main(String[] args){
    MCQuiz example = new MCQuiz("What is your name?", "Victoria");
    example.getQuestion();
  }
}
