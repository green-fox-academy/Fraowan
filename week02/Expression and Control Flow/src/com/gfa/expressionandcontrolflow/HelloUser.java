package com.gfa.expressionandcontrolflow;

import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    // Modify this program to greet the User instead of the World!
    // The program should ask for the name of the User
    Scanner scanner = new Scanner(System.in);
    String userNameInput1 = scanner.nextLine();

    System.out.println("Hello, " + userNameInput1 + "!");
  }
}
