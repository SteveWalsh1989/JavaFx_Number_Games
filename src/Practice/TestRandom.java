package Practice;

import java.util.Random;

/**
 * Created by Steve on 12/02/2018.
 */
public class TestRandom {


    static int random1;
    static int random2;

    public static void main(String[] args) {




        random1 = generateWinningNumber();

        random2 = generateWinningNumber();

        System.out.println("Random1 = " + random1);


        System.out.println("Random2 = " + random2);



    }



    /**
     * generateWinningNumber
     *
     * generate random number between 1 - 100 and store as winningNumber
     */
    public static int generateWinningNumber(){

        Random rand = new Random();

        int  random = rand.nextInt(100);
        System.out.println(random);

        return random;
    }



}
