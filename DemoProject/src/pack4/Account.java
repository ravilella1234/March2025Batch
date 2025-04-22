package pack4;

public abstract class Account 
{
	private String accountNumber;
    private String accountHolderName;
    protected double balance;
    
	public Account(String accountNumber, String accountHolderName, double balance) 
	{
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public abstract void accountType();
     
}
