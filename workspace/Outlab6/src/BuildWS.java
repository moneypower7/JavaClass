import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BuildWS {
	private int row, col; // Rows and columns required for the word search
	private char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
			'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' }; // holds the
															// characters to add
															// at random to fill
															// the array
	Random rand = new Random();
	Scanner u = new Scanner(System.in);
	char[][] wordSearch = new char[row][col];
	String input;
	ArrayList<String> words = new ArrayList<String>();

	public void build() {
		System.out.println("How many rows would you like? >");
		row = u.nextInt();
		System.out.println("How many columns would you like? >");
		col = u.nextInt();
		u.nextLine();
		wordSearch = new char[row][col];
		// Adds words to an ArrayList to later add to the word search array.
		input = "start";
		while (!input.equals("end")) {
			System.out.println("Add a word to your search (end to stop) >");
			input = u.nextLine();
			if (!input.equals("end")) {
				words.add(input);
			}
		}
		fillNoWord();
		fill();
		fillLetters();
		print();

	}
	//Fills the array with + signs to indicate where words are not, these will later be replaced with letters
	public void fillNoWord() {
		for (int x = 0; x < row; x++) {
			for (int y = 0; y < col; y++) {
				wordSearch[x][y] = '+';
			}
		}
	}
	//Fills the array (where there are not words) with letters
	public void fillLetters(){
		for (int x = 0; x < row; x++) {
			for (int y = 0; y < col; y++) {
				if (wordSearch[x][y] == '+'){
					wordSearch[x][y] = alphabet[rand.nextInt(26)];
				}
			}
		}
	}

	public void fill() {
		int choice;
		int randPos;
		int randRow;
		int counter;
		for (int x = 0; x < words.size(); x++) {
			choice = rand.nextInt(2);
			counter = 0;
			switch (choice) {
			case 0:// Add horizontally
				randRow = rand.nextInt(row); // Generates a random row to place
												// the word at
				randPos = rand.nextInt(wordSearch[randRow].length - words.get(x).length()); // Generates
																							// a
																							// random
																							// column
																							// position
																							// to
																							// start
																							// the
																							// word
																							// at,
																							// while
																							// avoiding
																							// out
																							// of
																							// bounds
																							// exception
				while (wordSearch[randRow][randPos] != '+') {
					randRow = rand.nextInt(row);
					randPos = rand.nextInt(wordSearch[randRow].length - words.get(x).length());
					if (counter > 30) {
						System.out.println(
								"One of the words you entered could not be placed horizontally without overlapping.");
					}
					counter++;
				}
				counter = 0;
				for (int y = randPos; y < words.get(x).length() + randPos; y++) {
					wordSearch[randRow][y] = words.get(x).charAt(counter);
					counter++;

				}
				break;
			case 1: // Add vertically
				randPos = rand.nextInt(col); // Generates a random column
												// position to start the word at
				randRow = rand.nextInt(col - words.get(x).length()); // Generates
																		// a
																		// random
																		// row
																		// position
																		// to
																		// start
																		// the
																		// word
																		// at,
																		// while
																		// avoiding
																		// out
																		// of
																		// bounds
																		// exception
				while (wordSearch[randRow][randPos] != '+') {
					randPos = rand.nextInt(col); // Generates a random column
													// position to start the
													// word at
					randRow = rand.nextInt(col - words.get(x).length()); // Generates
																			// a
																			// random
																			// row
																			// position
																			// to
																			// start
																			// the
																			// word
																			// at,
																			// while
																			// avoiding
																			// out
																			// of
																			// bounds
																			// exception
					if (counter > 30) {
						System.out.println(
								"One of the words you entered could not be placed horizontally without overlapping.");
					}
					counter++;
				}
				counter = 0;
				for (int y = randRow; y < words.get(x).length() + randRow; y++) {
					wordSearch[y][randPos] = words.get(x).charAt(counter);
					counter++;

				}
				break;
				
				//Never got diagonally working
				
				
			/*case 2: // Add diagonally
				randPos = rand.nextInt(col); // Generates a random column
				// position to start the
				// word at
				randRow = rand.nextInt(col - words.get(x).length()); // Generates
				// a
				// random
				// row
				// position
				// to
				// start
				// the
				// word
				// at,
				// while
				// avoiding
				// out
				// of
				// bounds
				// exception
				if (counter > 30) {
					System.out.println(
							"One of the words you entered could not be placed horizontally without overlapping.");
				}
				break;*/
			}
		}

	}

	public void print() {
		for (int i = 0; i < wordSearch.length; i++) {
			System.out.println(String.valueOf(wordSearch[i]));
		}

		System.out.println();
	}
}
