package icici.loans.homeloans;

public class HDFC implements Rbi
{

	@Override
	public void deposit() {
		System.out.println("Iam overridden deposit in HDFC");
	}

	@Override
	public void withdrawl() {
		System.out.println("Iam overridden withdrawl in HDFC");
	}
	
	public static void main(String[] args) 
	{
		HDFC h = new HDFC();
		h.deposit();
		h.withdrawl();
	}

}
