package com.company;

import java.util.Scanner;

public class GuessANumber {

    public static void guessANumber(int i) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Faites votre choix : \n");
        System.out.println("\t 1 - Trouvez votre nombre en 10 fois");
        System.out.println("\t 2 - Essayez jusqu'à ce que vous trouviez le bon chiffre");


        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                tenTimes();
                break;
            case 2:
                infiniteTimes();
                break;


        }

    }


    private static void tenTimes() {

        int randomNumber = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);

        int myGuess;
        int attemptsNum = 0;
        final int maxAttempts = 10;
        System.out.print("Guess a number between 1 and 100: ");
        do {
            myGuess = scanner.nextInt();

            if (myGuess > randomNumber)
                System.out.println("My number is smaller than " + myGuess + ".");
            else if (myGuess < randomNumber)
                System.out.println("My number is bigger than " + myGuess + ".");
            else
                System.out.println("Congratulation, you found the right number ");
        } while (myGuess != randomNumber && ++attemptsNum < maxAttempts);

        if (attemptsNum == maxAttempts)
            System.out.println("Too bad, you lost. The right number was :" + randomNumber);

    }

    private static void infiniteTimes() {
        int randomNumber = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);

        int myGuess;
        System.out.print("Guess a number between 1 and 100: ");
        do {
            myGuess = scanner.nextInt();

            if (myGuess > randomNumber)
                System.out.println("My number is smaller than " + myGuess + ".");
            else if (myGuess < randomNumber)
                System.out.println("My number is bigger than " + myGuess + ".");
            else
                System.out.println("Congratulation, you found the right number ");
        } while (myGuess != randomNumber);


    }

}



