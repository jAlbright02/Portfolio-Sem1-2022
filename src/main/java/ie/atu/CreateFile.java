package ie.atu;

import java.io.*;

public class CreateFile
{
    public static void main(String[] args)
    {


        //created an instance File
        File myFile = new File("MyFile.txt");
        System.out.println("My file is located at: " + myFile.getAbsolutePath());
        System.out.println("My file length: " + myFile.length());
        System.out.println("My file exists: " + myFile.exists());
        System.out.println("My file was last edited: " + myFile.lastModified());

        try
        {
            //created an instance of PrintWriter
            PrintWriter formatFile = new PrintWriter(myFile);
            formatFile.println("This is a formatted line using the PrintWriter class.");
            formatFile.println(12.65786);
            formatFile.println(false);

            formatFile.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}