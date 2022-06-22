 /**
 * Author: Chibin Yang
 * File: SavingAccountRunner.java
 * Description: This is a program used on an ATM
 */

import java.util.Scanner;

public class SavingsAccountRunner 
{

	public static void main(String[] args) 
	{
		//Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to your Savings Account APP!");
		
		//Get user inputs
		System.out.print("Enter your account number: ");
		int accountNumber = input.nextInt();
		
		System.out.print("Enter your initial balance: ");
		double initialBalance = input.nextDouble();
		
		System.out.print("Enter your interest rate: ");
		double IntRate = input.nextDouble();
		
		//Create an account
		SavingsAccount mySavingsAccount = new SavingsAccount(accountNumber, initialBalance);
		
		//Set the interest rate
		mySavingsAccount.setAnnualIntRate(IntRate);
		
		//To hold user input
		int userInput;
		
		//Display menu options with do-while loop
		do
		{
		System.out.println("----------------------------");
		System.out.println("1. Deposit");
		System.out.println("2. View Weekly Interest Amount");
		System.out.println("3. View Account Details");
		System.out.println("4. Exit");
		
		System.out.print("Enter your selection: ");
		userInput = input.nextInt();
		
		while(userInput != 1 && userInput != 2 && userInput != 3 && userInput != 4)
			{
				System.out.println("INVALID SELECTION - TRY AGAIN!");
				System.out.print("Enter your selection: ");
				userInput = input.nextInt();
			}
		
		if(userInput == 1)
		{
			System.out.print("Enter your deposit amount: ");
			double amount = input.nextDouble();
			
			while(amount < 0)
			{
				System.out.print("Invalid balance! Try again: ");
				amount = input.nextDouble();
			}
			if(amount >= 0)
			{
				mySavingsAccount.deposit(amount);
			    System.out.println("New Balance: " + mySavingsAccount.getBalance());
			}
		}
		else if(userInput == 2)
		{
			System.out.printf("Your weekly Interest Amount is: $%4.2f",
		     mySavingsAccount.getBalance() * mySavingsAccount.getWeeklyIntRate());
			System.out.println("");
		}
		else if(userInput == 3)
		{
			System.out.println("Account ID: " + mySavingsAccount.getId());
			System.out.println("Account Creation Date/Time: " + 
			                    mySavingsAccount.getDateEstablished());
			System.out.println("Balance: " + mySavingsAccount.getBalance());
			System.out.printf("Weekly Interest Amount: $%4.2f",
				               mySavingsAccount.getBalance() * mySavingsAccount.getWeeklyIntRate());
			System.out.println("");
			
		}
		else
		{
			System.out.println("Thank you - Goodbye!");
			break;
		}
		
		} while (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4);		
	}
}
