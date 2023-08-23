package com.linkedin.javacodechallenges;
import java.util.*;

public class WaterBill {
  public static double calculateWaterBill(double gallonsUsage){
    double minCharge = 18.84; //per 2 ccf
    int ccf = 748;  //minimum is 2 ccf
    double extraCharge = 3.90; //per ccf
    double answer = 0;
    if(gallonsUsage <= ccf*2){
      answer = minCharge;
    }
    else if(gallonsUsage > ccf*2){
      double extraUsage = gallonsUsage - (ccf*2);
      int remainder = (int)extraUsage / ccf;
      double nmm = extraUsage % ccf;
      if(nmm > 0 && nmm < ccf){
          remainder +=1;
        }
      answer = minCharge + remainder*extraCharge;
    }
    return answer;
  }

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("How many gallons of water did you use this month?: ");
    double usage = in.nextDouble();
    System.out.printf("Your water bill is %.2f", calculateWaterBill(usage));
    in.close();
  }
}
