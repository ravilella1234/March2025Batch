package pack5;

public class MainClass 
{

	public static void main(String[] args) 
	{
		CakeOperations chocolateCake = new ChocolateCake("Chocolate", 15.0);
		CakeOperations vanillaCake = new VanillaCake("Vanilla", 12.0);
		
		System.out.println("Ordering a Chocolate Cake:");
        chocolateCake.prepare();
        chocolateCake.bake();
        System.out.println("Price: $" + chocolateCake.getPrice1());

        System.out.println("\nOrdering a Vanilla Cake:");
        vanillaCake.prepare();
        vanillaCake.bake();
        System.out.println("Price: $" + vanillaCake.getPrice1());
	}

}
