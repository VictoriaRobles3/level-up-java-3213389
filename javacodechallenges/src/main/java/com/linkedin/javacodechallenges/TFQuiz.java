package com.linkedin.javacodechallenges;

public class TFQuiz extends Question {
  public String studentAnswer;

  public TFQuiz(String question, String answer) {
    super(question, answer);
  }
  
  public void addAnswer(){
    System.out.println("Input your answer, T for True or F for False: ");
    studentAnswer = in.nextLine();
  }

  public boolean checkAnswer(){
    boolean ans = false;
    String sans = "";
    switch(studentAnswer){
      case "T": case "t":
        sans = "true";
        break;
      case "F": case "f":
        sans = "false";
        break;
      default:
        System.err.println("Invalid input.");
    }
    if(sans.equalsIgnoreCase(answer)){
      ans = true;
    }
    else{
      ans = false;
    }
    return ans;
  }
}
