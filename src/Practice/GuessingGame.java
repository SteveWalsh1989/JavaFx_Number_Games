package Practice;

import java.util.Random;

import java.util.Scanner;

/**
 * Created by Steve on 11/02/2018.
 *
 * Functionality for Guessing game used to test out
 */
public class GuessingGame {

    // scanner input assigned to kbd
    static Scanner kbd = new Scanner(System.in);


    static int   numGuesses = 6;        // total number of guesses for user which is 6
    static boolean isWinner = false;    // assume user is not a winner initially, true if user guesses correctly


    public static void main(String[] args) {

        //-------------------------
        //   Attributes
        // ------------------------

        int userGuess;               // stores user guess taken from keyboard input
        int winningNumber = -1;        // stores random number that user will need to guess to win game

        //-------------------------
        //   start program
        // ------------------------

        winningNumber = generateWinningNumber();                      // generate random number and store as winningNumber

       // System.out.println(winningNumber);                          // TESTING : prints winning number to console

        while (isWinner == false && numGuesses != 0 )  {              // loop repeats until user is a winner

            userGuess = askUserGuess();                               // Ask user to guess a number between 1 - 100 and store as userGuess

            compareNumbers(userGuess, winningNumber);                 // check if guess is correct ;

            numGuesses--;                                             // decrease number of guesses

            System.out.println("Guesses remaining: " + numGuesses);   // prints remaining number of guesses to user

        }

        if (numGuesses == 0) {

            System.out.println("Game Over: No more guesses left!");   // game over due to no more guesses remaining

        } else if ( isWinner == true) {

            System.out.println("Game Over: Congratulations, you won the game!"); // game over due to user winning

        }

    }

    //-------------------------
    //   Methods
    // ------------------------

    /**
     * generateWinningNumber
     *
     * generate random number between 1 - 100 and store as winningNumber
     * @returns result: winningNumber that user will need to guess to win the guess
     */
    public static int generateWinningNumber(){

        int result = 0;

        Random rand = new Random();

        result= rand.nextInt(100) + 0;

        return result;

    }

    /**
     * askUserGuess
     *
     * asks the user to guess a number between 1 - 100
     *
     * @return guess - returns the users guess
     */
    public static int askUserGuess(){

        int guess=0;                                         // create variable to be returned with user guess

        System.out.println("Enter a guess between 1 - 100"); // ask user to guess

        guess = kbd.nextInt();                               // store user guess

        kbd.nextLine();                                      // Consume the remaining newline.

        return guess;                                        // return users guess
    }

    /**
     * compareNumbers
     *
     * compares the userGuess and winningNumber
     *
     * returns win - true if numbers are equal, false if not equal
     */
    public static void  compareNumbers(int userNum, int winningNum){



    if(userNum < winningNum) {

        guessHint("Higher!");   // print higher to user as they need to guess higher


    } else if (userNum > winningNum){

        guessHint("Lower!");    // print lower to user as they need to guess lower


    } else if(userNum == winningNum){ // checks if they are the same

        isWinner = true;             // set return variable to true as user won the game
    }

    }

    /**
     * guessHint
     *
     * gives user hint as to guess higher or lower next time
     *
     *
     * @param hint - higher or lower
     */
    public static void guessHint(String hint) {

        System.out.println(hint); // prints hint to user

    }





}
