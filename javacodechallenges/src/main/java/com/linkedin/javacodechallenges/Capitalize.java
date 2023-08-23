package com.linkedin.javacodechallenges;
import java.util.*;

public class Capitalize {
  public static void capitalize(String phrase){
    String[] words = phrase.split(" ");
    for(String s : words){
      s = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
      System.out.print(s + " ");
    }
  }
  
  public static void main(String[] args){
    System.out.println("Enter a phrase: ");
    Scanner in = new Scanner(System.in);
    String phrase = in.nextLine();
    capitalize(phrase);
    in.close();
  }
}
