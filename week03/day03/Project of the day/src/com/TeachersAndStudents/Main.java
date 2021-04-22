package com.TeachersAndStudents;

public class Main {
  public static void main(String[] args) {
    Student newStudent = new Student();
    Teacher newTeacher = new Teacher();

    newStudent.question(newTeacher);
    newTeacher.teach(newStudent);
  }
}
