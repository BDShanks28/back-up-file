public class AnimalRunner
{
	public static void main(String[] args)
	{
		Mammal[] myPets = new Mammal[4];
		myPets[0] = new Dog();
                myPets[1] = new Cat();
                myPets[2] = new Dog();
                myPets[3] = new Cat();

		for (Mammal pet : myPets)
		{
			pet.makeNoise();
			if (pet instanceof Dog)
			{
				((Dog)pet).playFetch();
			}
		}
	}
}
