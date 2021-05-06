package com.gfa.exam.animalprotection;

import java.util.Random;

public class Cat extends Animal {

  public Cat() {
    Random random = new Random();
    animalName = "Cat";
    healCost = random.nextInt(7);
  }
}
