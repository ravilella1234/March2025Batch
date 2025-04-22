package pack4;

public class MainClass 
{

	public static void main(String[] args) 
	{
		// Create a SavingsAccount instance
        SavingsAccount myAccount = new SavingsAccount("123456789", "John Doe", 1000.0);

        // View account details
        myAccount.viewAccountDetails();

        // Deposit money
        myAccount.deposit(500.0);   // Deposited: $500.0
        myAccount.checkBalance();   // Current Balance: $1500.0

        // Withdraw money
        myAccount.withdraw(200.0);  // Withdrawn: $200.0
        myAccount.checkBalance();   // Current Balance: $1300.0

        // Attempt to withdraw more than the balance
        myAccount.withdraw(2000.0); // Insufficient funds or invalid amount.
	}

}
