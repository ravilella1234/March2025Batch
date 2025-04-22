package pack3;

public class Rectangle extends Shape
{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() 
	{
		return length*width;
	}

}
