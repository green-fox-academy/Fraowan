package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
  public static void main(String[] args) {
    HashMap<String, String> mySecondMap = new HashMap<>();
    mySecondMap.put("978-1-60309-452-8", "A Letter to Jo");
    mySecondMap.put("978-1-60309-459-7", "Lupus");
    mySecondMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
    mySecondMap.put("978-1-60309-461-0", "The Lab");

    for (Map.Entry<String, String> entry : mySecondMap.entrySet()) {
      System.out.println(entry.getValue() + "(ISBN: " + entry.getKey() + ")");
    }
    mySecondMap.remove("978-1-60309-444-3");
    mySecondMap.remove("978-1-60309-461-0", "The Lab");
    mySecondMap.put("978-1-60309-450-4", "They Called Us Enemy");
    mySecondMap.put("978-1-60309-453-5", "Why Did We Trust Him?");
    System.out.println(mySecondMap.containsKey("478-0-61159-424-8"));
    System.out.println(mySecondMap.get("978-1-60309-453-5"));
  }
}
