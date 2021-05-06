package com.gfa.exam.animalprotection;

import java.util.Random;

public class Parrot extends Animal {

  public Parrot() {
    Random random = new Random();
    animalName = "Parrot";
    healCost = random.nextInt(7) + 4;
  }
}
