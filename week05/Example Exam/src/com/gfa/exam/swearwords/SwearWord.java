package com.gfa.exam.swearwords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class SwearWord {
  public static void main(String[] args) {
    ArrayList<String> forbiddenWords =
        new ArrayList<>(
            Arrays.asList(
                "fuck",
                "bloody",
                "cock",
                "shit",
                "fucker",
                "fuckstick",
                "asshole",
                "dick",
                "piss",
                "cunt"));
    String fileName = "nsfw-text.txt";
    System.out.println(clearNFSWContent(fileName, forbiddenWords));
  }

  public static int clearNFSWContent(String fileName, ArrayList<String> forbiddenWords) {
    int counter = 0;
    Path filePath = Paths.get(fileName);
    Path filePathCorrected = Paths.get("CorrectedVersion.txt");
    try {
      List<String> lines = Files.readAllLines(filePath);
      List<String> reconstructedLines = new ArrayList<>();
      for (String line : lines) {
        String[] splittedLine =
            line.replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll(";", "")
                .toLowerCase(Locale.ROOT)
                .split(" ");
        List<String> reconstructedLine = new ArrayList<>();

        for (String word : splittedLine) {
          if (forbiddenWords.contains(word)) {
            counter++;

          } else {
            reconstructedLine.add(word);
          }
        }
        reconstructedLines.addAll(reconstructedLine);
        System.out.println(reconstructedLines);
      }


      String printableReconstructedLines = "";
      for (String word : reconstructedLines){
        word += " ";
        printableReconstructedLines += word;
      }

      Files.write(filePathCorrected, Collections.singleton(printableReconstructedLines));
    } catch (IOException e) {
      System.out.println("error");
    }

    return counter;
  }
}
