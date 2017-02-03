/**
 * Driver for the Biologist app.
 * 
 * @author Troy Oster
 * @version 2 Oct 2016
 */
public class Driver {
	public static void main(String[] args) {
		Animal a1 = new Animal(0, "land", true);
		Animal a2 = new Animal(0, "air", true);
		Animal a3 = new Animal(0, "water", true);
		Animal a4 = new Animal(2, "air", true);
		Animal a5 = new Animal(2, "land", true);
		Animal a6 = new Animal(2, "land", false);
		Animal a7 = new Animal(4, "land", true);
		Animal a8 = new Animal(4, "land", false);
		Animal a9 = new Animal(1, "land", true);
		Biologist.identifyAnimal(a1);
		Biologist.petOrNot(a1);
		Biologist.identifyAnimal(a2);
		Biologist.petOrNot(a2);
		Biologist.identifyAnimal(a3);
		Biologist.petOrNot(a3);
		Biologist.identifyAnimal(a4);
		Biologist.petOrNot(a4);
		Biologist.identifyAnimal(a5);
		Biologist.petOrNot(a5);
		Biologist.identifyAnimal(a6);
		Biologist.petOrNot(a6);
		Biologist.identifyAnimal(a7);
		Biologist.petOrNot(a7);
		Biologist.identifyAnimal(a8);
		Biologist.petOrNot(a8);
		Biologist.identifyAnimal(a9);
		Biologist.petOrNot(a9);
	}
}