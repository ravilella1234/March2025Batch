package icici.loans.carloans;

public class ThirdClass 
{
	//Data Properties
	int a=10,b=20,c;	

	//Behaviours
	public void add()
	{
		c = a+b;
		System.out.println("Add of A & B is : " + c);
	}
	
	public void sub()
	{
		c = a-b;
		System.out.println("sub of A & B is : " + c);
	}

	
	public static void main(String[] args) 
	{
		ThirdClass obj = new ThirdClass();
		obj.add();
		obj.sub();
		
		
		ThirdClass obj1 = new ThirdClass();
		obj1.add();
		obj1.sub();
	}
	
}
