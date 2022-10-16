

import java.util.Scanner;

import javax.swing.JOptionPane;
import java.util.Random;
public class Testing {

    public static void main(String[] args) {

        int number1 = 0;

        System.out.println("Hello World!");
        //my linter doesn't like System.out.println, hmmm

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

        System.out.println("Welcome to Part 2");

        //Part 2
        
        String userInput = null;
        int number2 = 0;
        userInput = JOptionPane.showInputDialog(null,"Please enter a number");

        number2 = Integer.parseInt(userInput);

        checkOdd(number2);

        checkOdd2(number2);

        System.out.println(checkOdd3(number2));

        //higher or low game

        randomNum = random1.nextInt(10) + 1;
        guess = 0;

        while (guess != randomNum) {

            System.out.println("Guess a number between 1 and 10");
            guess = input1.nextInt();

            if (guess > randomNum)
                System.out.println("Too high, try again");

            else if (guess < randomNum)
                System.out.println("Too low, try again");
            else
                System.out.println("You guessed it!");

            } // end if

        } //main end

    private static void checkOdd(int number2) {
          
            if (number2 % 2 == 0) {
    
                System.out.println("The number is even");
    
            } else {
    
                System.out.println("The number is odd");
    
            } // end if
    }

    private static String checkOdd2(int number2) {

        String answer = null;
        
        if (number2 % 2 == 0) {

           answer = "The number is even";

        } else {

            answer = "The number is odd";

        } // end if

        return answer;
        
    }

    private static boolean checkOdd3(int number2) {

        return (number2 % 2 == 0);

    }


} // end class