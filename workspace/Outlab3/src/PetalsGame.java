import java.util.Random;

public class PetalsGame {
	// Instance object and variables
	Random rand = new Random();
	int numPetals, n; // number of petals and counting variable n
	int[] dice = new int[6];

	// Generates random integers between 1 and 6 and puts them into an array
	public void rollDice() {
		n = 0;
		while (n < 5) {
			dice[n] = rand.nextInt(6) + 1;
			n++;
		}
	}

	public void printDice() {
		System.out.println("You rolled the following: " + dice[0] + " , " + dice[1] + " , " + dice[2] + " , " + dice[3]
				+ " , " + dice[4]);
	}

	public int calculateAllPetals() {
		numPetals = 0;
		n = 0;
		//Runs through each dice and calculates the total petals
		while (n < 5) {
			if (dice[n] % 2 != 0) { //Checks if the number is odd, if so it adds the correct number of petals
				numPetals += (dice[n] - 1);
			}
			n++;
		}
		System.out.println("");
		return numPetals;
	}
}
