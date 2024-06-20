package fileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;


public class FileNotFoundException 
{

	public static void main(String[] args) throws java.io.FileNotFoundException
	{
		
		try 
		{
		  File file = new File("D://file.txt");
	      FileReader fr = new FileReader(file);
	      System.out.println(fr);
	      System.out.println("My name is yogesh singh");
		}
		catch(IOException fe)
		{
			fe.getMessage();
			System.out.println("The exception is being handled");
		}

	}
 
}
