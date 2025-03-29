package icici.loans.carloans;

public class FourthClass 
{
	int a,b,c;
	
	public void add(int a,int b)
	{
		c = a+b;
		System.out.println("Add of A & B is : " +  c);
	}
	
	public void sub(int a,int b)
	{
		c = a-b;
		System.out.println("sub of A & B is : " +  c);
	}
	
	public static void main(String[] args) 
	{
		FourthClass obj = new FourthClass();
		obj.add(10, 20);
		obj.sub(10, 20);
		
		FourthClass obj1 = new FourthClass();
		obj1.add(100, 200);
		obj1.sub(100, 200);
	}

}
