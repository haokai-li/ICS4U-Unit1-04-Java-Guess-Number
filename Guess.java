/*
* The "Guess number" program, just proves you can show print to terminal.
*
* @author  Haokai
*
* @version 1.0
*
* @since   2021-11-23
*
*/

import java.util.Random;
import java.util.Scanner;

/**
* This is the standard "Guess number" program.
*/
final class Guess {

    /**
    * Zero variable.
    */
    public static final int ZERO = 0;

    /**
    * SIX variable.
    */
    public static final int SIX = 6;

    /**
    * One variable.
    */
    public static final int ONE = 1;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Guess() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        // set
        final Random rand = new Random();
        final int right = rand.nextInt(SIX) + ONE;
        int guess = ZERO;

        while (true) {
            try {
                // input
                final Scanner guessSting = new Scanner(System.in);
                System.out.print("Guess a number between 1 to 6: ");
                guess = guessSting.nextInt();
                if (guess < ZERO || guess > SIX) {
                    System.out.println(
                        "This isn't between 1 to 6. This won't count."
                    );
                    System.out.println("");
                } else if (guess < right) {
                    System.out.println("Your guess too low!");
                    System.out.println("");
                } else if (guess > right) {
                    System.out.println("Your guess too high!");
                    System.out.println("");
                } else if (guess == right) {
                    System.out.println("You are correct!");
                    System.out.println("");
                    break;
                }
            } catch (java.util.InputMismatchException errorCode) {
                System.out.println("It is not a integer.");
                System.out.println("");
            }
        }
        System.out.println("\nDone.");
    }
}

