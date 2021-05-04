package com.gfa.abstractsandinterfaces.cloneable.people;

public class Mentor extends Person {
  private Level level;

  public Mentor(String name, int age, Gender gender, Level level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    setName("Jane Doe");
    setAge(30);
    setGender(Gender.FEMALE);
    setLevel(Level.INTERMEDIATE);
  }

  @Override
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println(
        "Hi, I'm "
            + getName()
            + ", a "
            + getAge()
            + " year old "
            + getGender()
            + " "
            + getLevel()
            + " mentor.");
  }

  public Level getLevel() {
    return level;
  }

  public void setLevel(Level level) {
    this.level = level;
  }
}
