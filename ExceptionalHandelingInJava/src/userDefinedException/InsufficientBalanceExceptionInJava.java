package userDefinedException;

class InsufficientBalanceException extends Exception
{
	public int amount;
	
	public InsufficientBalanceException(int amount)
	{
		this.amount=amount;
	}
	
	public int getAmount()
	{
		return amount;
	}
	
}

class CheckingAccount
{
	public int balance;
	public int number;
	
	public CheckingAccount(int number)
	{
		this.number=number;
	}
	
	public void deposit(int amount)
	{
		balance+=amount;
	}
	
	public void withdraw(int amount) throws InsufficientBalanceException
	{
		if(amount<=balance)
		{
			balance-=amount;
		}
		else
		{
			int lowBalance=amount-balance;
			throw new InsufficientBalanceException(lowBalance);
		}
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public int getNumber()
	{
		return number;
	}
	
}

public class InsufficientBalanceExceptionInJava 
{

	public static void main(String[] args) 
	{
	      CheckingAccount c = new CheckingAccount(1000);
	      
	      System.out.println("Depositing $500...");
	      c.deposit(500);
	      
	      try 
	      {
	         System.out.println("\nWithdrawing $100...");
	         c.withdraw(100);	
	         
	         System.out.println("\nWithdrawing $600...");
	         c.withdraw(600);
	      } 
	      catch (InsufficientBalanceException e) 
	      {
	         System.out.println("Sorry, but you are short $" + e.getAmount());
	         e.printStackTrace();
	      }
	      System.out.println(c.number);


	}

}
