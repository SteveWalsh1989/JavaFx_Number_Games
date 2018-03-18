package Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * ------------------------------------------------------------------------------------------------
 * Details :
 *
 *      Module: Object Orientated programming
 *
 *      Assignment 1: JavaFx
 *
 *      Steve Walsh R00151053
 *
 *      Last Update:  19/2/18
 *
 * ------------------------------------------------------------------------------------------------
 *
 * Tab 3 : Prizes
 *
 *      Retrives prize data from a text file and stores in hashmap
 *      Uses hashmap to store and retrieve prizes.
 *      Tab is only available to winning players
 *
 *
 */

public class Prizes {


    public static void main(String[] args) throws IOException {


        String filePath = "prizes.txt";                       // create file path string

        HashMap<String, String> map = new HashMap<>();        // create new hash map

        String line;                                          // create new string to read lines

        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        while ((line = reader.readLine()) != null)            // keep reading file until no more lines
        {
            String[] parts = line.split(":", 2);  // split lines into two by colon

            if (parts.length >= 2)                            // section of the parts into key and value
            {
                String key = parts[0];                        // part 1 = key
                String value = parts[1];                      // part 2 = value

                map.put(key, value);                          // stores key and value in hash map
            } else {
                System.out.println("ignoring line: " + line); // ignores
            }
        }

        /**  testing **/
        for (String key : map.keySet())
        {
            System.out.println(key + ":" + map.get(key)); // prints key and value from hash map to console
        }


        reader.close(); // close file reader


    } // close main





} // close class
