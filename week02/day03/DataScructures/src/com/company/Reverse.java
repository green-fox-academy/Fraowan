package com.company;

public class Reverse {
  public static void main(String... args) {
    String toBeReversed =
        ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a method that can reverse a String which is passed as parameter
    // Pass the toBeReversed variable to this method to check if it works well
    // Solve this task using charAt() function first
    // Try other solutions when you are done
    int stringLength = toBeReversed.length();

    System.out.println(reverse(toBeReversed));
    System.out.println(reverse2(toBeReversed));
  }

  public static String reverse(String toBeReversed) {
    String reversed = "";
    for (int i = toBeReversed.length() - 1; i >= 0; i--) {
      reversed = reversed + toBeReversed.charAt(i);
    }
    return reversed;
  }

  public static StringBuilder reverse2(String toBeReversed) {
    StringBuilder toBeReversed1 = new StringBuilder();
    toBeReversed1.append(toBeReversed);

    return toBeReversed1.reverse();
  }
}
