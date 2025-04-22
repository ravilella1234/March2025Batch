package pack2;

public class Cat implements Animal
{

	@Override
	public void sound() {
		System.out.println("Cat meows");
	}

	@Override
	public void eat() {
		System.out.println("Cat eats fish");
	}

}
