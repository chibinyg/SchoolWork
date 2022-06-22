import java.util.Date;

public class SavingsAccount 
{
		//Data fields
		private int id;
		private double balance;
		private double annualIntRate;
		private String dateEstablished;
		
		//Construct a default account
		public SavingsAccount()
		{
			id = 1111;
			balance = 0.0;
			Date date = new Date();
			dateEstablished = date.toString();			
		}
		
		//Construct an account with specific id and initial balance
		public SavingsAccount(int newId, double newBalance)
		{
			id = newId;
			balance = newBalance ;
			Date date = new Date();
			dateEstablished = date.toString();
		}
		
		//Return id
		public int getId()
		{
			return id;
		}
		//Set a new id
		public void setId(int newId)
		{
			id = newId;
		}
		
		//Return balance
		public double getBalance()
		{
			return balance;
		}
		//Set a new balance
		public void setBalance(double newBalance)
		{
		    balance = newBalance;
		}
		
		//Return annualIntRate
		public double getAnnualIntRate()
		{
			return annualIntRate;
		}
		//Set a new annnaulIntRate
		public void setAnnualIntRate(double newAnnualIntRate)
		{
			annualIntRate = newAnnualIntRate;
		}
		
		//Return dateEstablished
		public String getDateEstablished()
		{
			Date date = new Date();
			return date.toString();
		}
		
		//Return the weekly interest rate
		public double getWeeklyIntRate()
		{
			return ((annualIntRate/100.0)/52);
		}
		
		//Deposit money to the account
		public void deposit(double newAmount)
		{
			balance += newAmount;
		}	
}



