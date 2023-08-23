package com.linkedin.javacodechallenges;
import java.util.*;
public class DoubleOrNothing{

  public void playGame(){
    int points = 10;
    System.out.println("Your current points are: " + points);
    System.out.println("Do you want to keep playing for a chance to double or loose everything?: ");
    Scanner in = new Scanner(System.in);
    String answer = in.nextLine();
    in.close();
    switch(answer){
      case "yes": case "YES": case "Yes":
        Random random = new Random();
        int ranNum = random.nextInt(2);
        if(ranNum == 0){
          points = points * 2;
          System.out.println("You're taking home "+ points + " points");
        }
        else if(ranNum == 1){
          points = 0;
          System.out.println("You're taking home "+ points + " points");
        }
        break;
      case "no": case "NO": case "No":
        System.out.println("You're taking home "+ points + " points");
        break;
      default:
        System.out.println("Cannot recognize your answer.");
    }
  }
}