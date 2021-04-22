package com.Animal;

public class Animal {

  int hunger = 50;
  int thirst = 50;
  boolean playing;

  Animal() {}

  Animal(int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public void eat() {

    hunger--;
  }

  public void drink() {

    thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }

  // Create an Animal class
  // Every animal has a hunger value, which is a whole number
  // Every animal has a thirst value, which is a whole number
  // When creating a new animal instance these values must be set to the default 50 value
  //
  //  Every animal can eat() which decreases its hunger by one
  // Every animal can drink() which decreases its thirst by one
  // Every animal can play() which increases both its hunger and thirst by one
}
