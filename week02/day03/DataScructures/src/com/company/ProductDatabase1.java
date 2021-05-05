package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProductDatabase1 {
  public static void main(String[] args) {
    int max = Integer.MIN_VALUE;
    String mostExpensiveProductName = null;
    Map<String, Integer> productDatabase =
        new HashMap<String, Integer>() {
          {
            put("Eggs", 200);
            put("Milk", 200);
            put("Fish", 400);
            put("Apples", 150);
            put("Bread", 50);
            put("Chicken", 550);
          }
        };
    System.out.println("The Fish costs " + productDatabase.get("Fish") + " USD.");

    Set<Map.Entry<String, Integer>> entries = productDatabase.entrySet();
    for (Map.Entry<String, Integer> entry : entries) {
      if (entry.getValue() > max) {
        max = entry.getValue();
        mostExpensiveProductName = entry.getKey();
      }
    }
    System.out.println("The entry with the highest value is: " + mostExpensiveProductName);
    int sumOfPrices = 0;
    for (Map.Entry<String, Integer> entry : productDatabase.entrySet()) {
      sumOfPrices += entry.getValue();
    }
    System.out.println("The average price is: " + (sumOfPrices / productDatabase.size()));
  }
}
