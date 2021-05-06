package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {
  public static void main(String[] args) {

    System.out.println(copyFile("assets/my-file.txt", "assets/my-file_copied.txt"));
  }

  public static boolean copyFile(String sourcePathAndName, String targetPathAndName) {
    Path sourceFilePath = Paths.get(sourcePathAndName);
    Path targetFilePath = Paths.get(targetPathAndName);
    try {
      Files.copy(sourceFilePath, targetFilePath, StandardCopyOption.REPLACE_EXISTING);
      return true;
    } catch (IOException e) {
      return false;
    }
  }
  // Write a function that copies the contents of a file into another file
  // It should take two filenames (string) as parameters:
  //  - path and name of the source file
  //  - path and name of the target file
  // It should return a boolean that shows if the copy was successful
}
