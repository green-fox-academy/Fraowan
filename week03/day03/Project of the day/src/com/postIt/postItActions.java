package com.postIt;

public class postItActions {

  public static void main(String[] args) {
    // Create a few example post-it objects:

    postIt firstPostIt = new postIt("orange", "Idea1", "blue");
    postIt secondPostIt = new postIt("pink", "Awesome", "black");
    postIt thirdPostIt = new postIt("yellow", "Superb!", "green");

    System.out.println(thirdPostIt.textColor);
    // an orange with blue text: "Idea 1"
    // a pink with black text: "Awesome"
    // a yellow with green text: "Superb!"
  }
}
