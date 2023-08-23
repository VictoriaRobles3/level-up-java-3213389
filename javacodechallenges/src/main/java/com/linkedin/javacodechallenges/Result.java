package com.linkedin.javacodechallenges;

public class Result {

  public int possibleWinners(int n) {
    int[] original = new int[n];
    int count = 0;
    for(int i = 0; i < n; i++){
      original[i] = i+1;
    }
    for(int i = 0; i< original.length; i++){
      if(original[i] > 9){
        int fnum = original[i] % 10;
        int secnum = (original[i]%100)/10;
        original[i] = fnum + secnum;
      }
    }
    for(int i = 0; i < original.length; i++){
      for(int j = i+1; j < original.length; j++){
        if(original[i] == original[j]){
          count++;
        }
      }
    } return count;
  }

  public static void main (String [] args){
    Result example = new Result();
    System.out.println(example.possibleWinners(22));
  }

}