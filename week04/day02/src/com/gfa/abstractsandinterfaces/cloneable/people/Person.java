package com.gfa.abstractsandinterfaces.cloneable.people;

public class Person {
  private String name;
  private int age;
  private Gender gender;

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
  }

  public Person(String name, int age, Gender gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person() {
    setName("Jane Doe");
    setAge(30);
    setGender(Gender.FEMALE);
  }

  public String getName() {

    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }
}
