package oopproject;

public class SavingsAccount {

// instance variables
	int accountNumber;
	float balance;
	String status;
	int pin;
	String branch;
	final static float InterestRate = 3.25f;
	
	
	// default constructor
	public SavingsAccount()
	{
		
	}
	
	//parameterized constructor
	public SavingsAccount(int accountNumber, float balance, String status, int pin, String branch) {
		System.out.println("InterestRate: " + InterestRate);
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.status = status;
		this.pin = pin;
		this.branch = branch;
	}
	
	//static method
	public static float getInterestRate()
	{
		return InterestRate;
	}
	
	//non static method or instance variable
	
	public void withdraw(int withdrawalAmount) {
	if (this.status.equals("active"))
			{
		if(withdrawalAmount <= this.balance)
		{
			this.balance -= withdrawalAmount;
		}
		else {
			System.err.println(" You have insufficient funds");
			
		}
			}
	else {
		System.err.println(" Account is inactive ");
	     }
	                                          }	
	public void withdraw(int pin, int withdrawalAmount) {
		if (this.pin == pin) {
			if(withdrawalAmount < 40000)
			{
				withdraw(withdrawalAmount);
			}
		
			else {
				System.err.println(" Withdrawal Amount exceeded ");
			}
		}
		else
		  {System.err.println("invalid pin");
	}
}
	public void deposit(int depositAmount)
	{
		if (depositAmount >= 0)
		
	{
		this.balance += depositAmount;
	}
		else {
			System.err.println(" Min Balance is zero");
			
		}
	}
}

