package ie.atu.week4;

import java.util.Scanner;

public class Calc
{
    public static void main(String[] args)
    {
        substract();
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
}
