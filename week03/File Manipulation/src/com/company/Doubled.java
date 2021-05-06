package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt.
    // Decryption is the process reversing an encryption, i.e. the process
    // which converts encrypted data into its original form.
  decrypt();
    }
    public static void decrypt(){
        Path filePath = Paths.get("assets/duplicated-chars.txt");
        try{
        List<String> textLines = Files.readAllLines(filePath);
for (String textLine : textLines){
        for (int i = 0; i < textLines.size()-1; i+=2) {
          System.out.print(textLine.charAt(i));
        }
        System.out.println();
}
                }catch (IOException e){
      System.out.println("IO Error");
        }
    }
}
