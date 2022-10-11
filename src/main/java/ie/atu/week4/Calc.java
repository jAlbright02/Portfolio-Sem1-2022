package ie.atu.week4;
import java.util.Scanner;

public class Calc
{
    public static void main(String[] args)
    {
        multiply();
    }

    public static void multiply()
    {
        //Ask for user to enter 2 numbers
        System.out.println("Please enter first number: ");
        Scanner userInput = new Scanner(System.in);
        int firstNum = userInput.nextInt();

        System.out.println("Please enter second number: ");
        int secondNum = userInput.nextInt();

        //adds the two numbers
        int totalSum = firstNum * secondNum;

        //prints total
        System.out.println("Your total is " + totalSum);


    }
}
