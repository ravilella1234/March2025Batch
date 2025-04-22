package pack3;

public class UserClass 
{

	public static void main(String[] args) 
	{
		Shape myRectangle = new Rectangle(4.0, 6.0);
		myRectangle.displayArea();
		
		Shape myCircle = new Circle(5.0);
		myCircle.displayArea();
	}

}
