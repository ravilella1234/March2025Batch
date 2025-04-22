package pack5;

public class VanillaCake extends Cake implements CakeOperations 
{

	public VanillaCake(String flavor, double price) 
	{
		super(flavor, price);
	}

	@Override
	public void prepare() 
	{
		System.out.println("Preparing vanilla extract, flour, eggs, and sugar for Vanilla Cake.");
	}

	@Override
	public void bake()
	{
		System.out.println("Baking Vanilla Cake at 350°F for 25 minutes.");
	}

	@Override
	public void description() 
	{
		System.out.println("This is a light and fluffy vanilla cake.");
	}

	@Override
	public double getPrice1() 
	{
		return price;
	}

}
