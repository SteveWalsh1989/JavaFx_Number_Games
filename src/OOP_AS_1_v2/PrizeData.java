package OOP_AS_1_v2;


//--------------------------------------------------
//	IMPORTS
//--------------------------------------------------

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * ------------------------------------------------------------------------------------------------
 * Details :
 *
 * Module: Object Orientated programming
 *
 * Assignment 1: JavaFx
 *
 * Steve Walsh R00151053
 *
 * Last Update:  22/2/18
 *
 * ------------------------------------------------------------------------------------------------
 *
 * Hashmap data structure to store prizes
 *
 * 
 *
 *
 * ------------------------------------------------------------------------------------------------
 **/

//--------------------------------------------------
// CLASS
//--------------------------------------------------
public class PrizeData {

    static  Map<String, Prize> prizeMap;

    public static void storePrizes() throws Exception {


        prizeMap = new HashMap<>();                      //Creating map for Prizes to store integer and prize object

        String fileName = "src/OOP_AS_1_v2/prizes.txt"; // The name of the file to open.

        String line;                                     // This will reference one line at a time

        try {

            FileReader fileReader = new FileReader(fileName);                     // FileReader reads text files in the default encoding.

            BufferedReader bufferedReader = new BufferedReader(fileReader);       //  wrap FileReader in BufferedReader.

            while ((line = bufferedReader.readLine()) != null) {                  // keep going whilst there are mor lines in file

                String[]  individualPrize = line.split(":");                // split by colon to create array of

                Prize prize = new Prize(individualPrize[0], individualPrize[1]);  // use first and second values of txt file to create prize object

                prizeMap.put(individualPrize[2], prize);                          // store third value from text file as key and prize object as value

            }
            bufferedReader.close();                                               //  close file

        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");         // print error about opening file
        } catch (IOException ex) {
            System.out.println("Error reading file '"  + fileName + "'");          // print error about reading file

        }

        /*    testing : prints key value along with starValue and prize name
         prizeMap.forEach((key, value) -> System.out.println(key + " : " + value.getStarValue() + " : " + value.getPrizeWon() ));
        */


    } // close main

} // close class


