

import java.util.Scanner;

import javax.swing.JOptionPane;
import java.util.Random;
public class Testing {

    public static void main(String[] args) {

        int number1 = 0;

        System.out.println("Hello World!");

        Scanner input1 = new Scanner(System.in);

        System.out.println("Please Enter a favorite number");
        number1 = input1.nextInt();

        System.out.println("You entered: " + number1);

        JOptionPane.showMessageDialog(null, "Hello User");

        //for loop time

        for (int i = 1; i <= 10; i++) {

           System.out.println("number: " + i);
           //prints number 10 times.
           //starts at 1 cause it looks better and doing (i + 1) does not look as good.

        
        } // end for loop

        //while loop example, error validation of entering random number

        Random random1 = new Random();


        int randomNum = random1.nextInt(10) + 1;

        int guess = 0;

        while (guess != randomNum) {

            System.out.println("Guess a number between 1 and 10");
            guess = input1.nextInt();

            if (guess != randomNum) {

                System.out.println("Wrong, try again");

            } // end if

        } // end while

        System.out.println("You guessed it!");

        input1.close();

        } //end main


} // end class