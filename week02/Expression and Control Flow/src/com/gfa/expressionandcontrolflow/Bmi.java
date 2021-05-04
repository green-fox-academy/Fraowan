package com.gfa.expressionandcontrolflow;

public class Bmi {
  public static void main(String[] args) {
    double massInKg = 81.2;
    double heightInM = 1.78;
    double heightInCm = heightInM * 100;
    double bMI = (massInKg / heightInCm / heightInCm) * 10000;
    System.out.println(bMI);
    // Print the Body mass index (BMI) based on these values
  }
}
