package com.Sharpie;

import com.Animal.Animal;

import java.util.ArrayList;

public class penCase {
  public static void main(String[] args) {
    Sharpie sharpie1 = new Sharpie("green", 0.5f);
    Sharpie sharpie2 = new Sharpie("blue", 0.8f);
    Sharpie sharpie3 = new Sharpie("red", 1.0f);

    ArrayList<Sharpie> sharpieArrayList = new ArrayList<>();
    sharpieArrayList.add(sharpie1);
    sharpieArrayList.add(sharpie2);
    sharpieArrayList.add(sharpie3);


    for (int i = 0; i < sharpieArrayList.size(); i++) {
      Sharpie sharpieList = sharpieArrayList.get(i);
      sharpieList.use();
    }

    System.out.println(sharpie1.inkAmount);
    System.out.println(sharpie2.inkAmount);
    System.out.println(sharpie3.inkAmount);
  }
}
