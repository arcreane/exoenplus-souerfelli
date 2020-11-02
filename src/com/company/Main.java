package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    static boolean quit = false;

    public static void main(String[] args) {

        do {
            menu();
            userInput();
        } while (!quit);
    }


    public static void menu() {
        System.out.println("\n Selectionner l'exercie : \n");
        System.out.println("\t 1 - Guess a Number");
        System.out.println("\t 2 - Palindrome");
        System.out.println("\t 3 - Random Array");
        System.out.println("\t 4 - Minesweeper");
        System.out.println("\t 5 - Quit");
    }

    private static void userInput() {
        try {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    GuessANumber.guessANumber(0);
                    break;
                case 2:
                    Palindrome.palindrome(1);
                    break;
                case 3:
                    RandomArray.randomArray(2);
                    break;
                case 4:
                    Minesweeper.minesweeper(3);
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("You have to select one of the options in the menu between 1 and 5");
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("You need to chose one of the options above");
            scanner.nextLine();
        }

    }

}
