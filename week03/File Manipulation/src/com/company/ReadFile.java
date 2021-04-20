package com.company;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class ReadFile {
  public static void main(String[] args) {
    Path filePath = Paths.get("assets/cuccos.txt");
    try { // Required by Files.readAllLines(filePath);
      // Reads the content from `lorem-ipsum.txt` in the `assets` folder line by line to a String
      // List
      List<String> lines = Files.readAllLines(filePath);
      System.out.println(lines.get(2)); // Prints the first line of the file
    } catch (IOException e) {
      System.out.println("Uh-oh, could not read the file!");
    }
  }
}
