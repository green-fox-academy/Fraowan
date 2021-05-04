package com.gfa.expressionandcontrolflow;

public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    int currentHoursInSeconds = currentHours * 3600;
    int currentMinutesInSeconds = currentMinutes * 60;
    int remainingSecondsFromADay =
        86400 - (currentHoursInSeconds + currentMinutesInSeconds + currentSeconds);
    System.out.println(remainingSecondsFromADay);

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables above
  }
}
