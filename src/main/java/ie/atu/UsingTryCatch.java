package ie.atu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        //run in a while loop until user gives suitable entry
        while (true) {

            System.out.println("Enter a number between 0 - 9: ");

            //try to run the code as expected
            try {
                Scanner userScan = new Scanner(System.in);
                int userNum = userScan.nextInt();

                if (userNum <= 9 && userNum > 0) {
                    System.out.println("You entered " + userNum);
                    break;
                } else {
                    System.out.println("Not a valid number.");
                }
            } catch (InputMismatchException e) { //catch the error as user gave unexpected input
                System.out.println("Try enter a valid number.");
            }
        }
    }
}
