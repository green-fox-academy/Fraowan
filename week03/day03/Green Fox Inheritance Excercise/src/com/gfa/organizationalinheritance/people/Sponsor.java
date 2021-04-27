package com.gfa.organizationalinheritance.people;

public class Sponsor extends Person implements Cloneable {
  private String company;
  private int hiredStudents;

  public Sponsor(String name, int age, Gender gender, String company) {
    setHiredStudents(0);
  }

  public Sponsor() {
    setName("Jane Doe");
    setAge(30);
    setGender(Gender.FEMALE);
    setCompany("Google");
    setHiredStudents(0);
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
            + " who represents "
            + getCompany()
            + " and hired "
            + getHiredStudents()
            + " students so far.");
  }

  public void hire() {
    if (hiredStudents < 0) {
      throw new IllegalArgumentException();
    }
    hiredStudents += 1;
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public int getHiredStudents() {
    return hiredStudents;
  }

  public void setHiredStudents(int hiredStudents) {
    this.hiredStudents = hiredStudents;
  }
}
