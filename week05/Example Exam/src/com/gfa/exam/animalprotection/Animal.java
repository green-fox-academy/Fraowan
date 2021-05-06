package com.gfa.exam.animalprotection;

public class Animal {
  protected String animalName;
  protected String ownerName;
  protected boolean isHealthy;
  protected int healCost;

  public Animal() {
    animalName = "Animal";
  }

  public void heal() {
    isHealthy = true;
  }

  public boolean isAdoptable() {
    return isHealthy;
  }

  @Override
  public String toString() {

    if (isHealthy) {
      return animalName + " is healthy and adoptable";
    } else {
      return animalName + " is not healthy (" + healCost + "EUR), and not adoptable";
    }
  }
}
