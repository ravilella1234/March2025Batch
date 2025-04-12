package icici.loans.personalloans;

public class Emp 
{
	int eno;
	String ename;
	
	public Emp(int eno, String ename) 
	{
		super();
		this.eno = eno;
		this.ename = ename;
	}
	
	public void display()
	{
		System.out.println(eno);
		System.out.println(ename);
	}


	public static void main(String[] args) 
	{
		Emp obj = new Emp(1744, "kiran");
		obj.display();
	}

}
