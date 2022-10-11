package ie.atu.week4;
import java.util.Scanner;

public class Calc
{
    public static void main(String[] args)
    {
        substract();
        multiply();
    }

    public static void substract()
    {
        System.out.print("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNum = inputs.nextInt();

        System.out.print("Please enter your second number: ");
        int secondNum = inputs.nextInt();
        
        int subtractionResult = firstNum - secondNum;
        System.out.println("The total is " + subtractionResult);

        
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
