package nulPointerException;

class NulPointerException
{
	public void nullPointerException()
	{
		String name=null;
		
		if(name.equals("Yogesh"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}

public class NullPointerExceptionInJava 
{

	public static void main(String[] args) 
	{
		NulPointerException n=new NulPointerException();
		n.nullPointerException();
	}

}
