package com.TeachersAndStudents;

public class Teacher {

  public static void teach(Student student) {
    student.learn();
  }

  public static void giveAnswer() {
    System.out.println("the teacher is answering a question");
  }
}
