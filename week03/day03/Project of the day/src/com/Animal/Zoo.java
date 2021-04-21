package com.Animal;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {
        Animal tiger = new Animal();
        Animal lion = new Animal();
        Animal zebra = new Animal();

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(tiger);
        animalList.add(lion);
        animalList.add(zebra);

    for (int i = 0; i < 5; i++) {
        Animal allAnimal = animalList.get(i);
        allAnimal.play();
    }
    System.out.println(tiger);
    System.out.println(lion);
    System.out.println(zebra);
    }
}
