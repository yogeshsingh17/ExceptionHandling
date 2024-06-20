package illegalArgumentException;

class IllegalArgumenException
{
	public void illegalArgumentExeption() throws InterruptedException
	{
		Thread.sleep(-100);		//Time cannot be negative.It will give IllegalArgumentException
	}
}

public class IllegalArgumentExceptionInJava 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//IllegalArgumenException e=new IllegalArgumenException();
		//e.illegalArgumentExeption();
		
		Thread t1=new Thread(new Runnable()
				{
					public void run()
					{
						try
						{
							Thread.sleep(-100);
						}
						catch(IllegalArgumentException | InterruptedException e1)
						{
							e1.printStackTrace();
							e1.getMessage();
							System.out.println("The exception has been handled");
						}
						System.out.println("This is runable class");
					}
					
					
				});
		
		t1.start();
		
	}

}
