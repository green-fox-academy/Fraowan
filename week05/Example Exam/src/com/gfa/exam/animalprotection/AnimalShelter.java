package com.gfa.exam.animalprotection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalShelter {

  public static void main(String[] args) {
    Cat cat1 = new Cat();
    Dog dog1 = new Dog();
    Parrot parrot1 = new Parrot();
    System.out.println(cat1);
    AnimalShelter animalShelter = new AnimalShelter();
    animalShelter.rescue(cat1);
    animalShelter.rescue(dog1);
    animalShelter.rescue(parrot1);
    System.out.println(animalShelter);
  }

  private int budget;
  private List<Animal> animals;
  private List<String> adopters;

  public AnimalShelter() {
    budget = 50;
    animals = new ArrayList<>();
    adopters = new ArrayList<>();
  }

  public int rescue(Animal animal) {
    animals.add(animal);
    return animals.size();
  }

  public int heal() {
    for (Animal animal : animals) {
      if (!animal.isHealthy && budget >= animal.healCost) {
        animal.heal();
        budget -= animal.healCost;
        return 1;
      }
    }
    return 0;
  }

  public void addAdopter(String name) {
    adopters.add(name);
  }

  public void findNewOwner() {
    Random random = new Random();
    if (adopters.size() > 0 && animals.size() > 0) {
      ArrayList<Animal> adoptableAnimals = new ArrayList<>();
      for (Animal animal : animals) {
        if (animal.isAdoptable()) {
          adoptableAnimals.add(animal);
        }
      }
      if (adoptableAnimals.size() > 0) {
        int randomAnimalIndex = random.nextInt(adoptableAnimals.size());
        int randomAdopterIndex = random.nextInt(adopters.size());

        // Animal removableAnimal = adoptableAnimals.get(randomAnimalIndex);
        animals.remove(randomAnimalIndex);
        adopters.remove(randomAdopterIndex);
      }
    }
  }

  public int earnDonation(int amount) {
    budget += amount;
    return budget;
  }

  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("Budget: ")
        .append(budget)
        .append("€,\n")
        .append("There are ")
        .append(animals.size())
        .append("(s) and ")
        .append(adopters.size())
        .append(" potential adopter(s)\n")
        .append(animals);

    // Budget: <budget>€,
    // There are <animals.count> animal(s) and <potentionalAdopters.count> potential adopter(s)
    // <name> is not healthy (healing would cost: <heal cost> €) and not adoptable
    // <name> is healthy and adoptable

    return s.toString();
  }
}
