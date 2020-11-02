package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void palindrome(int i) {

        Scanner word = new Scanner(System.in);
        System.out.println("Please, enter your word :");

        String myWord = word.next();
        String reverseMyWord = reverse(myWord);

        if (myWord.equals(reverseMyWord)) {
            System.out.println("This word is a palindrome");
        } else {
            System.out.println("This word is not a palindrome");
        }
    }

    private static String reverse(String string) {
        StringBuilder builder = new StringBuilder(string);
        return builder.reverse().toString();
    }
}
