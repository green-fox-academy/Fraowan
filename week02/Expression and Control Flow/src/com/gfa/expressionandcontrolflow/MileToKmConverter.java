package com.gfa.expressionandcontrolflow;

import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for a double that is a distance in miles,
    // then it converts that value to kilometers and prints it
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a distance in miles!");
    double distanceInMiles = scanner.nextDouble();
    System.out.println(
        "The distance you have entered in miles is actually "
            + distanceInMiles * 1.60934
            + " kilometers.");
  }
}
