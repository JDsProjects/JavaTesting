import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {

        int number1 = 0;

        System.out.println("Hello World!");

        Scanner input1 = new Scanner(System.in);

        System.out.println("Please Enter a favorite number");
        number1 = input1.nextInt();

        System.out.println("You entered: " + number1);

        input1.close();
    }
}
