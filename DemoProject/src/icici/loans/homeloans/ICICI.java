package icici.loans.homeloans;

public class ICICI implements Rbi
{

	@Override
	public void deposit() {
		System.out.println("Iam overridden deposit in ICICI");
	}

	@Override
	public void withdrawl() {
		System.out.println("Iam overridden withdrawl in ICICI");
	}
	
	public static void main(String[] args) 
	{
		ICICI i = new ICICI();
		i.deposit();
		i.withdrawl();
	}

}
