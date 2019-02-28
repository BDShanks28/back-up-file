public class AnimalRunner
{
	public static void main(String[] args)
	{
		Mammal[] myPets = new Mammal[6];
		myPets[0] = new Dog();
                myPets[1] = new Cat();
		myPets[2] = new Bird();
                myPets[3] = new Dog();
                myPets[4] = new Cat();
		myPets[5] = new Bird();

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
