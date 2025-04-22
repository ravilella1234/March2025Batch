package pack3;

public class Circle extends Shape
{
	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double calculateArea() 
	{
		return Math.PI*radius*radius;
	}

}
