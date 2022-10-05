

import java.util.Scanner;

import javax.swing.JOptionPane;

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

        input1.close();
    } // end main program
} //end of actual class
