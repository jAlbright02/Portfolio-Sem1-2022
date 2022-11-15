package ie.atu;

import java.io.*;

public class CreateFile
{
    public static void main(String[] args)
    {


        //created an instance myFile
        File myFile = new File("MyFile.txt");
        System.out.println("My file is located at: " + myFile.getAbsolutePath());
        System.out.println("My file length: " + myFile.length());
        System.out.println("My file exists: " + myFile.exists());
        System.out.println("My file was last edited: " + myFile.lastModified());

        try
        {
            FileWriter outputFile = new FileWriter(myFile, true);
            outputFile.write("This is a new file. Hello and goodbye.\n");
            outputFile.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}