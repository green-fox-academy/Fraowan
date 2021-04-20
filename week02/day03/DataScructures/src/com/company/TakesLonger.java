package com.company;

public class TakesLonger {
    public static void main(String... args) {
        StringBuilder quote = new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");

        // When saving this quote a disk error has occurred. Please fix it!
        // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
        // Use pieces of the quote variable (instead of just redefining the string)!


        String stringAddition = " always takes longer than ";

quote.append(stringAddition);
        //quote.append()



        System.out.println(quote.substring(0, 20) + " always takes longer than " + quote.substring(21));
        //+ quote.substring(21)
    }
}