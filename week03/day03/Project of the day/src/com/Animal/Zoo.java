package com.Animal;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {

  public static void main(String[] args) {
    Animal tiger = new Animal();
    Animal lion = new Animal();
    Animal zebra = new Animal();

    ArrayList<Animal> animalList = new ArrayList<>();
    animalList.add(tiger);
    animalList.add(lion);
    animalList.add(zebra);

    for (int i = 0; i < animalList.size(); i++) {
      Animal allAnimal = animalList.get(i);
      allAnimal.play();
    }
    System.out.println(tiger.hunger);
    System.out.println(lion.hunger);
    System.out.println(zebra.hunger);

    for (int i = 0; i < animalList.size(); i++) {
      Animal allAnimal = animalList.get(i);
      allAnimal.drink();
    }

    for (int i = 0; i < animalList.size(); i++) {
      Animal allAnimal = animalList.get(i);
      allAnimal.eat();
    }
    System.out.println(tiger.hunger);
    System.out.println(lion.hunger);
    System.out.println(zebra.hunger);

  }
}
