//***********************************
//   test.java         @ArshiaKo
//
//   MY FIRST PROGRAM IN JAVA!!!!
//***********************************

import java.util.Scanner;

public class Time {  
  public static void main (String [] args) {
    
    double hour = 22, minute = 35, second = 38;
    
    double midnightHour = 24;
    double midnightMinute = 00;
    double midnightSecond = 00;
    
    double secondsfromMN = (second + (minute * 60) + (hour * 60 * 60));
    double secondsLeft = 86400 - secondsfromMN;
    double percentage =  100 * secondsfromMN  / 86400;
    
    // seconds since midnight:
    System.out.println("Seconds Since Midnight: " + (int)secondsfromMN);
    
    // seconds remaining in the day (86400 is seconds in a day)
    System.out.println("Seconds Left In The Day: " + (int)secondsLeft);
    
    // percentage
    System.out.println("Percentage of Day Done: " + (int)percentage + "%");
    
  }

}
    