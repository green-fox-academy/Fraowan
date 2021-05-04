package com.gfa.expressionandcontrolflow;

import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    // Write a program that asks for two numbers
    // The first number represents the number of girls that comes to a party, the
    // second represents the number of boys
    //
    // If the the number of girls and boys are equal and 20 or more people are coming to the party
    // it should print: The party is excellent!
    //
    // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
    // it should print: Quite a cool party!
    //
    // If there are less people coming than 20
    // it should print: Average party...
    //
    // If no girls are coming, regardless the count of the people
    // it should print: Sausage party
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type here the number of boys invited to the party:");
    int numberOfBoysInvited = scanner.nextInt();
    System.out.println("Type here the number of girls invited to the party");
    int numberOfGirlsInvited = scanner.nextInt();
    int totalNumberOfPeopleInvited = numberOfBoysInvited + numberOfGirlsInvited;
    if (numberOfGirlsInvited == numberOfBoysInvited && totalNumberOfPeopleInvited >= 20) {
      System.out.println("The party is excellent!");
    } else if (totalNumberOfPeopleInvited >= 20
        && numberOfBoysInvited / numberOfGirlsInvited != 1
        && numberOfGirlsInvited / numberOfBoysInvited != 1) {
      System.out.println("Quite a cool party!");
    } else if (totalNumberOfPeopleInvited < 20 && numberOfGirlsInvited > 0) {
      System.out.println("Average party...");
    } else if (numberOfGirlsInvited == 0) {
      System.out.println("Sausage party");
    }
  }
}
