package icici.loans.personalloans;

public class EmployeeChild  extends Employee
{
	String city;
	

	public EmployeeChild(String city) 
	{
		super(1744, "Ravi", 13.45f);
		
		this.city = city;
		
		System.out.println(this.city);
	}

	
	public static void main(String[] args) 
	{
		EmployeeChild obj = new EmployeeChild("hyderabad");
	}

}
