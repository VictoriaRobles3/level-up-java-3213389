package com.linkedin.javacodechallenges;

public class Palindrome {
  public boolean isPalindrome(String s){
    char start = s.charAt(0);
    boolean result = false;
    char end = s.charAt(s.length() -1);
    if(start == end){
      result = true;
    } return result;
  }
  public static void main(String[] args){
    String s = "aabaca";
    Palindrome example = new Palindrome();
    System.out.println(example.isPalindrome(s));
  }
}
