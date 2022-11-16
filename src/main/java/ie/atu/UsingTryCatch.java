package ie.atu;

import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 - 9: ");
        Scanner userScan = new Scanner(System.in);
        int userNum = userScan.nextInt();

        if(userNum <= 9 && userNum > 0) {
            System.out.println("You entered " + userNum);
        } else{
            System.out.println("Not a valid number.");
        }

    }
}
