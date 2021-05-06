package com.gfa.exam.animalprotection;

import java.util.Random;

public class Dog extends Animal {

  public Dog() {
    Random random = new Random();
    animalName = "Dog";
    healCost = random.nextInt(8) + 1;
  }
}
