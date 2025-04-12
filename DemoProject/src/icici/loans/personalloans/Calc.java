package icici.loans.personalloans;

public class Calc 
{
	int a,b,c;
	
	
	public Calc(int a, int b) 
	{
		super();
		this.a = a;
		this.b = b;
	}
	
	public void add(int x,int y)
	{
		this.a = x;
		this.b = y;
		
		c= a+b;
		System.out.println(c);
	}



	public static void main(String[] args) 
	{
		Calc obj = new Calc(10, 20);
		obj.add(100, 200);
	}

}
