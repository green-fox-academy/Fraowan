package com.company;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;

public class CountLines {
    public static void main(String[] args) {
        Path filePath = Paths.get("assets/my-file.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
      System.out.println(lines.size());
      System.out.println(lines);

        } catch(IOException e){
      System.out.println("File cannot be found");
        }

    }
}
// Write a function that takes a filename as string as a parameter and returns the number of lines the file contains.
// It should return zero if it can't open the file
// and should not raise any error.