package Practice;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import javax.swing.*;
import javax.xml.soap.Text;
import java.awt.*;
import java.util.Collection;
import java.util.Random;

/**
 * Created by Steve on 12/02/2018.
 *
 *  Partial Functionality for lotto game
 */
public class LottoGame  extends Application{





 /* ----------------------------------------------------
        Game 2 :  Variables
    ---------------------------------------------------- */
  static int   numberLimit = 6;                        // limits number of winning numbers and user guesses
  static int[] userGuess      = new int[numberLimit];  // array to store usersGuess of lotto numbers
  static int[] winningNumbers = new int[numberLimit];  // array to store 6 winning numbers randomly generated
  static int[] checkWinnings  = new int[numberLimit];  // array that will be used to compare elements of userGuess against winningNumbers




    public static void main(String[] args) {
        Application.launch(args);


    }

    @Override
    public void start(Stage primaryStage)
    {

        winningNumbers = generateWinningLottoNumbers(numberLimit); // Fill winningNumbers array with unique random numbers





    // allow user to select 6 numbers
        storeUserGuess();

    // store each number in userGuess


    // compare    userGuess winningNumbers, each time element is found, add 1 to checkWinnings


    // check winnings: count the number of 1 in the  checkWinnings array to determine prize


    // display if user won or lost


    // display prize



     /*
      ----------------------------------------------------
             Game 12 Lotto Game Layout
      ----------------------------------------------------
      */


        //-----------------------------
        //      Tabs
        //-----------------------------

        //-----------------------------
        //      V Box
        //-----------------------------

        // Section 1: Top of screen: UserGuess and Winning Number labels

        VBox vBox_Numbers_labels  = new VBox();  // create new vBox for the UserGuess and winningLottoNumbers labels

        HBox hBox_User_Numbers    = new HBox();  // adding hBox for user numbers

        HBox hBox_Winning_Numbers = new HBox();  // adding hBox for winning numbers

        vBox_Numbers_labels.getChildren().addAll(hBox_User_Numbers,hBox_Winning_Numbers ); // add the two hboxes to the top vbox


        // hBox_User_Numbers:  Adding labels
        JLabel label_user_numbers[] = new JLabel[numberLimit];

        for(int i = 0; i < numberLimit ; i++ ) {

            label_user_numbers[i].setText(("Guess = " + i));

            hBox_User_Numbers.getChildren().addAll((Collection<? extends Node>) label_user_numbers[i]);

        }


        // generate 6 labels

        // create array of 6 labels

        // assign name

        // add to box




        // hBox_User_Numbers:  Adding labels









        //-----------------------------
        //      H Box
        //-----------------------------

        //-----------------------------
        //      Numbers
        //-----------------------------

        //-----------------------------
        //      Buttons
        //-----------------------------


             /*
            ----------------------------------------------------
             Game 2: Button Actions
            ----------------------------------------------------
             */





    } // close main

    /**
     * generateWinningLottoNumbers
     *
     * generates an integer array and stores unique random numbers within them
     *
     * @param size : size of array you wish to fill
     *
     * @return winnningNumbers   : returns integer array
     */
    public static int[] generateWinningLottoNumbers (int size) {

        int[] winnningNumbers = new int[size];                            // creates new array to store the winning numbers

        for (int index1 = 0; index1 < size; index1++) {                   // loop through array to store the numbers

            winnningNumbers[index1] = (int)(Math.random()*45);            // generate random number between 0 - 45

            for (int index2 = 0; index2 < index1; index2++) {             // check if random has already been selected by comparing with other elements in array
                if (winnningNumbers[index1] == winnningNumbers[index2]) { // if not unique it gives element new number
                    winnningNumbers[index2] = (int)(Math.random()*45);
                }
            }
        }

        /******  testing: prints winning numbers to console *******/

        for (int index3 = 0; index3 < winnningNumbers.length; index3++) {
            System.out.println("Winning number " + (index3 + 1) + " is: "  + winnningNumbers[index3]);
        }

        return winnningNumbers; // returns winning number array
    }







/**
 *  storeUserGuess
 *
 *  stores users guesses
 *
 */
public static void storeUserGuess() {






    }


}
