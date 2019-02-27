public class Cat extends Mammal
{
	private String name;
	public Cat()
	{
		super();
		this.name = "mean";
	}

	public Cat(String name){
		super();
		this.name = name;
	}

	public void makeNoise()
	{
		System.out.println("Meow");
	}
}
