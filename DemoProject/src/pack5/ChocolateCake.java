package pack5;

public class ChocolateCake extends Cake implements CakeOperations
{

	public ChocolateCake(String flavor, double price) 
	{
		super(flavor, price);
	}

	@Override
	public void prepare() 
	{
		System.out.println("Preparing chocolate, flour, eggs, and sugar for Chocolate Cake.");
	}

	@Override
	public void bake() 
	{
		System.out.println("Baking Chocolate Cake at 350°F for 25 minutes.");
	}

	@Override
	public void description() 
	{
		 System.out.println("This is a rich and creamy chocolate cake.");
	}

	@Override
	public double getPrice1() 
	{
		return price;
	}
	
}
