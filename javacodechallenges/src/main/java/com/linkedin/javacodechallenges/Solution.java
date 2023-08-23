package com.linkedin.javacodechallenges;
import java.util.*;

public class Solution {
  public int[] removeDuplicates(int[] nums){
    int iterator = 1;
    for(int i = 0; i < nums.length -1; i++){
      if(nums[i] != nums[iterator]){
        nums[i] = nums[i+1];
        iterator++;
      }
    } return nums;
  }

  public static void main(String[] args){
    Solution example = new Solution();
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    System.out.println(Arrays.toString(example.removeDuplicates(nums)));
  }
}
