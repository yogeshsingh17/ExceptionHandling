package arrayIndexOutOfBoundException;

class PositiveInteger
{
	
	public void arrayMethod()
	{
		int [] a=new int[3];
		a[0]=2;
		a[1]=3;
		a[2]=4;
		
		
		try {
		System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		finally
		{
		System.out.println("This statement lies after exception handling");
		}
	}
	
	
}

public class Numbers 
{

	public static void main(String[] args) 
	{
		PositiveInteger p=new PositiveInteger();
		p.arrayMethod();

	}

}
