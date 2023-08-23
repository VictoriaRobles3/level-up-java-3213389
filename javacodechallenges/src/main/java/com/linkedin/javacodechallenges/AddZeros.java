package com.linkedin.javacodechallenges;
import java.util.Scanner;
public class AddZeros {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("================================");
    for (int i = 0; i < 3; i++) {
      String s1 = sc.next();
      int x = sc.nextInt();
      String ex = "";
      if (x < 100) {
        ex = String.valueOf(x);
        for (int j = 0; j < ex.length(); j++) {
          if (ex.length() < 3) {
            ex = "0" + ex;
          }
        }
      } else {
        ex = String.valueOf(x);
      }
      System.out.printf("%-14s %-1s\n", s1, ex);

    }
    System.out.println("================================");
  }
  
}
