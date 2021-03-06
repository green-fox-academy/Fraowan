package com.gfa.expressionandcontrolflow;

import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {

    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number of chickens your farm has.");
    int numberOfChickens = scanner.nextInt();
    System.out.println("Please enter the number of pigs your farm has.");
    int numberOfPigs = scanner.nextInt();
    int totalNumberOfLegs = numberOfChickens * 2 + numberOfPigs * 4;
    System.out.println(
        "In total, the animals have "
            + totalNumberOfLegs + " legs on the farm.");
  }
}
