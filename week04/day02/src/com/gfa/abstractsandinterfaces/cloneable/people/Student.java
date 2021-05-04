package com.gfa.abstractsandinterfaces.cloneable.people;

public class Student extends Person {
  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, Gender gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    setName("Jane Doe");
    setAge(30);
    setGender(Gender.FEMALE);
    setPreviousOrganization("The School of Life");
    setSkippedDays(0);
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer");
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
            + " from "
            + previousOrganization
            + " who skipped "
            + skippedDays
            + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    if (numberOfDays < 0) {
      throw new IllegalArgumentException();
    }
    skippedDays += numberOfDays++;
  }

  public String getPreviousOrganization() {

    return previousOrganization;
  }

  public void setPreviousOrganization(String previousOrganization) {

    this.previousOrganization = previousOrganization;
  }

  public int getSkippedDays() {

    return skippedDays;
  }

  public void setSkippedDays(int skippedDays) {

    this.skippedDays = skippedDays;
  }
}
