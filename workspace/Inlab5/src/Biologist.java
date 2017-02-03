
public class Biologist {
	// Identify Animal method
	public static void identifyAnimal(Animal inA) {
		Animal a = inA;
		switch (a.getNumLegs()) {
		case 0:
			System.out.println("No legs");
			switch (a.getEnvironment()) {
			case "land":
				System.out.println("Lives on land");
				System.out.println("---> Sounds like a snake.");
				break;
			case "water":
				System.out.println("Lives in the water");
				System.out.println("---> It's probably a fish.");
				break;
			case "air":
				System.out.println("Lives in the air");
				System.out.println("---> I don't know, sounds fake.");
				break;
			}
			break;
		case 2:
			System.out.println("Two legs");
			switch (a.getEnvironment()) {
			case "land":
				System.out.println("Lives on land");
				if (a.getSeemsNice()) {
					System.out.println("Seems nice");
					System.out.println("---> Bro, that's your classmate.");
				} else {
					System.out.println("Doesn't seem nice");
					System.out.println("---> Bigfoot.  Take a picture.");
				}
				break;
			case "air":
				System.out.println("Lives in the air");
				System.out.println("---> That's easy dawg, its a Bird.");
				break;
			}
			break;
		case 4:
			System.out.println("Four legs");
			if (a.getSeemsNice()) {
				System.out.println("Seems nice");
				System.out.println("---> Probably a dog.");
			} else {
				System.out.println("Doesn't seem nice");
				System.out.println("---> Skunk. Watch out!");
			}
			break;
		}
	}

	public static void petOrNot(Animal inA) {
		Animal a = inA;
		if (a.getSeemsNice() && a.getNumLegs() == 4) {
			System.out.println("Sure, pet it");
		} else if (a.getSeemsNice() == false || a.getNumLegs() == 0) {
			System.out.println("Dont pet it");
		} else {
			System.out.println("That's an odd number of legs.  It's probably hurt or crawly.");
			System.out.println("Pet at your own risk");
		}
		System.out.println("");
	}
}
