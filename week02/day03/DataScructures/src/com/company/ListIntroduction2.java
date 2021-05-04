package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {
  public static void main(String[] args) {
    List<String> listA = new ArrayList<>(){
      {
        add("Apple");
        add("Avocado");
        add("Blueberries");
        add("Durian");
        add("Lychee");}
    };
    List<String> listB = new ArrayList<>(listA);
    System.out.println(listA.contains("Durian"));
    listB.remove("Durian");
    listA.add(4, "Kiwifruit");
    System.out.println("Are the two list the same size?" + (listA.size()==listB.size()));
    
  }
}
      //  Create a list ('List A') which contains the following values
//        Apple, Avocado, Blueberries, Durian, Lychee
     //   Create a new list ('List B') with the values of List A
   //     Print out whether List A contains Durian or not
  //      Remove Durian from List B
   //     Add Kiwifruit to List A after the 4th element
  //      Compare the size of List A and List B
   //     Get the index of Avocado from List A
   //     Get the index of Durian from List B
  //      Add Passion Fruit and Pomelo to List B in a single statement
    //    Print out the 3rd element from List A
