package icici.loans.homeloans;

public interface Rbi 
{
	public void deposit();
	public void withdrawl();
	
	default void ministatement()
	{
		System.out.println("iam ministatement default method from RBI");
	}
	
	
	public static void main(String[] args) 
	{
		//Rbi i = new Rbi();
		
		Rbi i;
		
		i = new ICICI();
		i.deposit();
		i.withdrawl();
		
		i = new HDFC();
		i.deposit();
		i.withdrawl();
	}
}
