package ie.atu;

import java.io.*;
import java.util.Scanner;

public class CreateFile
{
    public static void main(String[] args)
    {
        //prompt user to input a file name and use scanner to read it
        System.out.println("Please enter a filename you want to access: ");
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();


        try
        {
            //use scanner to read the file by reading one line
            //then checking if there's another, when there is no more it stops
            Scanner userFile = new Scanner(new File(filename));

            while(userFile.hasNext())
            {
                String fileText = userFile.nextLine();
                System.out.println(fileText);
            }

            userFile.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
