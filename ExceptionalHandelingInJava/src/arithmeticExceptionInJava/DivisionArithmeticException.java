package arithmeticExceptionInJava;

import java.util.Scanner;

class Division
{
	public void division()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the first number to divide: ");
		int num1=scan.nextInt();
		
		System.out.println("Enter the second number to divide: ");
		int num2=scan.nextInt();
		
		System.out.println("The division of the two numbers is: ");
		
		//Multiple Catch blocks
		
		try
		{
		int result=num1/num2;
		System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.getMessage();
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		
		
		scan.close();
		
		System.out.println("This statement will be printed after exceptional handling");

		
	}
}

public class DivisionArithmeticException 
{

	public static void main(String[] args) 
	{
		Division d=new Division();
		d.division();
	}

}
