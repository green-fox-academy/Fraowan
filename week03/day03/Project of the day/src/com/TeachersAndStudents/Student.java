package com.TeachersAndStudents;

public class Student {

  public void learn() {
    System.out.println("the student is actually learning");
  }

  public void question(Teacher teacher) {
    teacher.giveAnswer();
  }
}
