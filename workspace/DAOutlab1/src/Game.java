import java.util.Random;

public class Game {
	Card[] deck = new Card[52];
	Card[] usedCards = new Card[52];
	Random rand = new Random(); // used to generate a random card draw method
	Player p1 = new Player();
	int randCard; // Assigned to a random integer that corresponds to a card in
					// the deck

	public void genDeck() { // Generates a deck of 52 cards
		for (int x = 0; x < 13; x++) {
			deck[x] = new Card(x, "Hearts");
		}
		for (int x = 13; x < 26; x++) {
			deck[x] = new Card((x - 11), "Diamonds");
		}
		for (int x = 26; x < 39; x++) {
			deck[x] = new Card((x - 24), "Clubs");
		}
		for (int x = 39; x < 52; x++) {
			deck[x] = new Card((x - 37), "Spades");
		}
	}

	public void shuffle() { // Shuffles the deck using the variable temp as a
							// placeholder to hold the card while another card
							// is moved
		for (int x = deck.length - 1; x > 0; x--) {
			int rand = (int) (Math.random() * (x + 1));
			Card temp = deck[x];
			deck[x] = deck[rand];
			deck[rand] = temp;
		}
	}

	public void deal() {
		randCard = rand.nextInt(52);
		p1.addCard(deck[randCard]);
		System.out.print("You have been dealt the ");
		switch (deck[randCard].getNum()) { //Switch statement to determine if the card dealt to the player was a face card, and if so print out the card's name instead of numeber value
		case 11:
			System.out.print("Jack");
			break;
		case 12:
			System.out.print("Queen");
			break;
		case 13:
			System.out.print("King");
			break;
		case 14:
			System.out.print("Ace");
			break;
		default:
			System.out.print(deck[randCard].getNum());
		}
		System.out.println(" of " + deck[randCard].getSuit());
	}

	public void play() {
		genDeck();
		shuffle();
		deal();
	}
}
