package pack5;

public abstract class Cake 
{
	protected String flavor;
    protected double price;
    
	public Cake(String flavor, double price) 
	{
		super();
		this.flavor = flavor;
		this.price = price;
	}

	public String getFlavor() {
		return flavor;
	}

	public double getPrice() {
		return price;
	}
    
	public abstract void description(); // Abstract method to describe the cake
    
}
