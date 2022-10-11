package ie.atu.week4;
import java.util.Scanner;

public class Calc
{
    public static void main(String[] args)
    {
        add();
    }
    public static void add()
    {
        //ASK USER TO INPUT NUMBER
        System.out.println("Enter first number: ");
        Scanner input = new Scanner(System.in);     //create scanner
        int num_first = input.nextInt();

        //ASK USER FOR SECOND NUMBER
        System.out.println("Enter second number: ");
        int num_second = input.nextInt();

        //PRINTS CALCULATION
        int sum = num_first + num_second;
        System.out.println("The Sum is: " + sum);
    }

}
