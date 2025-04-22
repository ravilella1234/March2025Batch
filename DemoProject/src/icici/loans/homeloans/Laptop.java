package icici.loans.homeloans;

public interface Laptop 
{
	public void copy();
	public void paste();
	public void cut();
	public void keyboard();
	
	default void security()
	{
		System.out.println("Laptop security code");
	}
	
	static void audio()
	{
		System.out.println("Laptop audio code");
	}
	

}
