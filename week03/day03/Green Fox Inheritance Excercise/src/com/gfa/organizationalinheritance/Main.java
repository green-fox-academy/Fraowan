package com.gfa.organizationalinheritance;

import com.gfa.organizationalinheritance.cohorts.Cohort;
import com.gfa.organizationalinheritance.people.*;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<>();

    Person mark = new Person("Mark", 46, Gender.MALE);
    people.add(mark);
    Person jane = new Person();
    people.add(jane);
    Student john = new Student("John Doe", 20, Gender.MALE, "BME");
    people.add(john);
    Student student = new Student();
    people.add(student);
    Mentor gandhi = new Mentor("Gandhi", 148, Gender.MALE, Level.SENIOR);
    people.add(gandhi);
    Mentor mentor = new Mentor();
    people.add(mentor);
    Sponsor sponsor = new Sponsor();
    people.add(sponsor);
    Sponsor elon = new Sponsor("Elon Musk", 46, Gender.MALE, "SpaceX");
    people.add(elon);

    student.skipDays(3);

    for (int i = 0; i < 5; i++) {
      elon.hire();
    }

    for (int i = 0; i < 3; i++) {
      sponsor.hire();
    }

    for (Person person : people) {
      person.introduce();
      person.getGoal();
    }

    Cohort awesome = new Cohort("AWESOME");
    awesome.addStudent(student);
    awesome.addStudent(john);
    awesome.addMentor(mentor);
    awesome.addMentor(gandhi);
    awesome.info();
  }
}
