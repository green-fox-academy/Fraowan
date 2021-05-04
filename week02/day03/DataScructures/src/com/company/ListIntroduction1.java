package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {
  public static void main(String[] args) {
    List<String> listOfNames = new ArrayList<String>();
    System.out.println("The current number of names on the list is: " + listOfNames.size());
    listOfNames.add("William");
    System.out.println(listOfNames.isEmpty());
    listOfNames.add("John");
    listOfNames.add("Amanda");
    System.out.println("The current number of names on the list is: " + listOfNames.size());
    System.out.println(listOfNames.get(2));
    for (int i = 0; i < listOfNames.size(); i++) {
      System.out.println(listOfNames.get(i));
    }
    for (int i = 0; i < listOfNames.size(); i++) {
      System.out.println(i + 1 + "." + " " + listOfNames.get(i));
    }
    listOfNames.remove(1);
    for (int i = listOfNames.size() - 1; i >= 0; i--) {
      System.out.println(listOfNames.get(i));
    }
    listOfNames.clear();
    System.out.println(listOfNames.isEmpty());
  }
}
