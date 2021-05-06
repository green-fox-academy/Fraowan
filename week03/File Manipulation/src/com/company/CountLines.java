package com.company;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;

public class CountLines {
  public static void main(String[] args) {
    System.out.println(showNumberOfLines("my-file1.txt"));
  }

  public static int showNumberOfLines(String fileName) {
    Path filePath = Paths.get("assets/" + fileName);
    try {
      List<String> lines = Files.readAllLines(filePath);
      return lines.size();
    } catch (IOException ignored) {
    }
    return 0;
  }
}
// Write a function that takes a filename as string as a parameter and returns the number of lines
// the file contains.
// It should return zero if it can't open the file
// and should not raise any error.
