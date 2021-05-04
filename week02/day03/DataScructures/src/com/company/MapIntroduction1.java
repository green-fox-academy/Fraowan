package com.company;

import java.util.HashMap;

public class MapIntroduction1 {
  public static void main(String[] args) {
    HashMap<Integer, Character> myFirstMap = new HashMap<>();
    System.out.println(myFirstMap.isEmpty());
    myFirstMap.put(97, 'a');
    myFirstMap.put(98, 'b');
    myFirstMap.put(99, 'c');
    myFirstMap.put(65, 'A');
    myFirstMap.put(66, 'B');
    myFirstMap.put(67, 'C');
    System.out.println(myFirstMap.keySet());
    System.out.println(myFirstMap.values());
    myFirstMap.put(68, 'D');
    System.out.println(myFirstMap.size());
    System.out.println(myFirstMap.get(99));
    myFirstMap.remove(97);
    System.out.println(myFirstMap.containsKey(100));
    myFirstMap.clear();
    System.out.println(myFirstMap.size());
  }
}
