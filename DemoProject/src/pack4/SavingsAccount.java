package pack4;

public class SavingsAccount extends Account implements ATMOperations
{

	public SavingsAccount(String accountNumber, String accountHolderName, double balance) 
	{
		super(accountNumber, accountHolderName, balance);
	}

	@Override
	public void deposit(double amount) 
	{
		if (amount > 0) 
		{
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
	}

	@Override
	public void withdraw(double amount) 
	{
		if (amount > 0 && amount <= balance) 
		{
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
	}

	@Override
	public void checkBalance() 
	{
		System.out.println("Current Balance: $" + balance);
	}

	@Override
	public void viewAccountDetails() 
	{
		 System.out.println("Account Holder: " + getAccountHolderName());
	     System.out.println("Account Number: " + getAccountNumber());
	     accountType();
	     checkBalance();
	}

	@Override
	public void accountType() 
	{
		System.out.println("Account Type: Savings Account");
	}

}
