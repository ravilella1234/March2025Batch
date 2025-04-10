package icici.loans.personalloans;


class Parent
{
	public void workHard()
	{
		System.out.println("Parent : wakeup early, goto college...");
	}
	
	public void care()
	{
		System.out.println("Parent : Atmost care");
	}
}


public class Child extends Parent
{
	public void workHard()
	{
		System.out.println("Child : wakeup anytime, goto movie...");
	}
	
	public void love()
	{
		System.out.println("Child : iam in love...");
	}

	public static void main(String[] args) 
	{
		Child c = new Child();
		c.workHard();
		c.care();
		c.love();
	}

}
