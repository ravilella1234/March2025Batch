package pack3;

public abstract class Shape 
{
	public abstract double calculateArea();
	
	public void displayArea()
	{
		System.out.println("The area is : " + calculateArea());
	}
}
