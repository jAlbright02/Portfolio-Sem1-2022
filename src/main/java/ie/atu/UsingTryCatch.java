package ie.atu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {

        System.out.println("Enter a number between 0 - 9: ");

        //try to run the code as expected
        try {
            Scanner userScan = new Scanner(System.in);
            int userNum = userScan.nextInt();

            if (userNum <= 9 && userNum > 0) {
                System.out.println("You entered " + userNum);
            } else {
                System.out.println("Not a valid number.");
            }
        } catch(InputMismatchException e) { //catch the error as user gave unexpected input
            System.out.println("Invalid entry.");
        }
    }
}
