import java.util.Random;
import java.util.Scanner;

public class Game {
	// Player declarations to handle up to 4 players
	Player dealer = new Player();
	Card[] deck = new Card[52];
	Player p1 = new Player();
	Player p2 = new Player();
	Player p3 = new Player();
	Player p4 = new Player();
	// the deck
	int players; // used for the user to input how many players will be playing
	Random rand = new Random(); // used to generate a random card draw method
	int randCard; // Assigned to a random integer that corresponds to a card in
					Scanner u = new Scanner(System.in); // Scanner
	// Constructor gives the dealer essentially infinite cash
	Card[] usedCards = new Card[52];

	public Game() {
		dealer.addCash(Integer.MAX_VALUE);
	}

	public int calcPlayers() { // Makes sure that there are still players
								// playing
		return (p1.getCash() + p2.getCash() + p3.getCash() + p4.getCash());
	}

	public void deal(int inPlayer) { // Deals the card to the player that is
										// specified in the parameter
		//System.out.println("Player: " + inPlayer);
		randCard = rand.nextInt(52);
		while (deck[randCard] == null) {
			randCard = rand.nextInt(52);
		}
		switch (inPlayer) {
		case 1:
			p1.addCard(deck[randCard]);
			break;
		case 2:
			p2.addCard(deck[randCard]);
			break;
		case 3:
			p3.addCard(deck[randCard]);
			break;
		case 4:
			p4.addCard(deck[randCard]);
			break;
		case 5: // Case to deal to the dealer
			dealer.addCard(deck[randCard]);
			break;
		}
		/*
		System.out.print("You have been dealt the ");
		switch (deck[randCard].getNum()) { // Switch statement to determine if
											// the card dealt to the player was
											// a face card, and if so print out
											// the card's name instead of
											// number value
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
			break;
		}
		System.out.println(" of " + deck[randCard].getSuit()); */
		deck[randCard] = null;
	}

	public void dealDealer(int inCardNum) { // Deals to the dealer and only
											// prints out the third card drawn
		randCard = rand.nextInt(52);
		while (deck[randCard] == null) {
			randCard = rand.nextInt(52);
		}
		dealer.addCard(deck[randCard]);
		if (inCardNum > 2) {
			if (inCardNum == 5){
				System.out.println("The dealer hits (draws another card indicating that the dealer has a total less than 26)");
			}
			System.out.print("The dealer has 2 cards face down and has been dealt the ");
			switch (deck[randCard].getNum()) { // Switch statement to determine
												// if
			// the card dealt to the player was
			// a face card, and if so print out
			// the card's name instead of
			// number value
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
				break;
			}
			System.out.println(" of " + deck[randCard].getSuit());
			deck[randCard] = null;
		}
	}

	public void genDeck() { // Generates a deck of 52 cards
		for (int x = 0; x < 14; x++) {
			deck[x] = new Card(x + 2, "Hearts");
		}
		for (int x = 14; x < 27; x++) {
			deck[x] = new Card((x - 12), "Diamonds");
		}
		for (int x = 27; x < 40; x++) {
			deck[x] = new Card((x - 25), "Clubs");
		}
		for (int x = 40; x < 52; x++) {
			deck[x] = new Card((x - 38), "Spades");
		}
	}

	// Has the user input how many players will be playing and assigns a cash
	// value to each player
	public void getPlayers() {
		System.out.println("How many players will be playing? (Up to 4 players)");
		players = u.nextInt();
		switch (players) {
		case 1:
			p1.addCash(500);
			break;
		case 2:
			p1.addCash(500);
			p2.addCash(500);
			break;
		case 3:
			p1.addCash(500);
			p2.addCash(500);
			p3.addCash(500);
			break;
		case 4:
			p1.addCash(500);
			p2.addCash(500);
			p3.addCash(500);
			p4.addCash(500);
			break;
		default:
			System.out.println("Error, please enter a valid number of players");
			getPlayers();
		}

	}
	public void hand(){ //Represents a single hand
		p1.getBet(1);
		p2.getBet(2);
		p3.getBet(3);
		p4.getBet(4);
		for (int x = 1; x < 4; x++) { //Checks if the player has enough cash to play the hand, if so it deals to them
			dealDealer(x);
			if (p1.getCash()>0){
				deal(1);
			}
			if (p2.getCash()>0){
				deal(2);
			}
			if (p3.getCash()>0){
				deal(3);
			}
			if (p4.getCash()>0){
				deal(4);
			}
		}
		//These while loops are for "hitting" (taking more cards)
		while (p1.getPlaying()){
			p1.canPlay(dealer, 1);
			if (p1.getPlaying()){
				deal(1);
			}
		}
		while (p2.getPlaying()){
			p2.canPlay(dealer, 2);
			if (p2.getPlaying()){
				deal(2);
			}
		}
		while (p3.getPlaying()){
			p3.canPlay(dealer, 3);
			if (p3.getPlaying()){
				deal(3);
			}
		}
		while (p4.getPlaying()){
			p4.canPlay(dealer, 4);
			if (p4.getPlaying()){
				deal(4);
			}
		}
		dealer.pointTotal(5);
		while (dealer.getTotal()<26){
			dealDealer(5);
			dealer.pointTotal(5);
		}
		System.out.println("The dealer now totals: " + dealer.getTotal());
		winCase();
	}

	public void play() {
		getPlayers();
		genDeck();
		shuffle();
		//This while loop represents the game, one loop through represents a hand played
		while (calcPlayers() != 0) { // Makes sure that players are still in the
										// game
			hand();
			calcPlayers();
			reset();
			genDeck();
			shuffle();
		}
	}
	public void reset(){ //resets the hands and bets of the players, also resets the de
		p1.reset();
		p2.reset();
		p3.reset();
		p4.reset();
		dealer.reset();
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
	public void winCase(){  //Determines who won and who lost the hand and calls the appropriate methods within the player class
		
		switch (players) {
		case 1:
			System.out.println("The dealer ended with a total of " + dealer.getTotal());
			System.out.println("Player 1 ended with a total of " + p1.getTotal());
			if (p1.getTotal()<=dealer.getTotal()){
				System.out.println("Player 1 has lost $" + p1.reBet());
				p1.lose();
			}else if (p1.getTotal()==dealer.getTotal()){
				System.out.println("Player 1 has pushed, the bet has been refunded");
			}else{
				System.out.println("Player 1 has won $" + p1.reBet());
				p1.win();
			}
			break;
		case 2:
			System.out.println("The dealer ended with a total of " + dealer.getTotal());
			System.out.println("Player 1 ended with a total of " + p1.getTotal());
			System.out.println("Player 2 ended with a total of " + p2.getTotal());
			if (p1.getTotal()<=dealer.getTotal()){
				System.out.println("Player 1 has lost $" + p1.reBet());
				p1.lose();
			}else if (p1.getTotal()==dealer.getTotal()){
				System.out.println("Player 1 has pushed, the bet has been refunded");
			}else{
				System.out.println("Player 1 has won $" + p1.reBet());
				p1.win();
			}
			if (p2.getTotal()<=dealer.getTotal()){
				System.out.println("Player 2 has lost $" + p2.reBet());
				p2.lose();
			}else if (p2.getTotal()==dealer.getTotal()){
				System.out.println("Player 2 has pushed, the bet has been refunded");
			}else{
				System.out.println("Player 2 has won $" + p2.reBet());
				p2.win();
			}
			break;
		case 3:
			System.out.println("The dealer ended with a total of " + dealer.getTotal());
			System.out.println("Player 1 ended with a total of " + p1.getTotal());
			System.out.println("Player 2 ended with a total of " + p2.getTotal());
			System.out.println("Player 3 ended with a total of " + p3.getTotal());
			if (p1.getTotal()<=dealer.getTotal()){
				System.out.println("Player 1 has lost $" + p1.reBet());
				p1.lose();
			}else if (p1.getTotal()==dealer.getTotal()){
				System.out.println("Player 1 has pushed, the bet has been refunded");
			}else{
				System.out.println("Player 1 has won $" + p1.reBet());
				p1.win();
			}
			if (p2.getTotal()<=dealer.getTotal()){
				System.out.println("Player 2 has lost $" + p2.reBet());
				p2.lose();
			}else if (p2.getTotal()==dealer.getTotal()){
				System.out.println("Player 2 has pushed, the bet has been refunded");
			}else{
				System.out.println("Player 2 has won $" + p2.reBet());
				p2.win();
			}
			if (p3.getTotal()<=dealer.getTotal()){
				System.out.println("Player 3 has lost $" + p3.reBet());
				p3.lose();
			}else if (p3.getTotal()==dealer.getTotal()){
				System.out.println("Player 3 has pushed, the bet has been refunded");
			}else{
				System.out.println("Player 3 has won $" + p3.reBet());
				p3.win();
			}
			break;
		case 4:
			System.out.println("The dealer ended with a total of " + dealer.getTotal());
			System.out.println("Player 1 ended with a total of " + p1.getTotal());
			System.out.println("Player 2 ended with a total of " + p2.getTotal());
			System.out.println("Player 3 ended with a total of " + p3.getTotal());
			System.out.println("Player 4 ended with a total of " + p4.getTotal());
			if (p1.getTotal()<=dealer.getTotal()){
				System.out.println("Player 1 has lost $" + p1.reBet());
				p1.lose();
			}else if (p1.getTotal()==dealer.getTotal()){
				System.out.println("Player 1 has pushed, the bet has been refunded");
			}else{
				System.out.println("Player 1 has won $" + p1.reBet());
				p1.win();
			}
			
			if (p2.getTotal()<=dealer.getTotal()){
				System.out.println("Player 2 has lost $" + p2.reBet());
				p2.lose();
			}else if (p2.getTotal()==dealer.getTotal()){
				System.out.println("Player 2 has pushed, the bet has been refunded");
			}else{
				System.out.println("Player 2 has won $" + p2.reBet());
				p2.win();
			}
			
			if (p3.getTotal()<=dealer.getTotal()){
				System.out.println("Player 3 has lost $" + p3.reBet());
				p3.lose();
			}else if (p3.getTotal()==dealer.getTotal()){
				System.out.println("Player 3 has pushed, the bet has been refunded");
			}else{
				System.out.println("Player 3 has won $" + p3.reBet());
				p3.win();
			}
			
			if (p4.getTotal()<=dealer.getTotal()){
				System.out.println("Player 4 has lost $" + p4.reBet());
				p4.lose();
			}else if (p4.getTotal()==dealer.getTotal()){
				System.out.println("Player 4 has pushed, the bet has been refunded");
			}else{
				System.out.println("Player 4 has won $" + p4.reBet());
				p4.win();
			}
			break;
		default:
			System.out.println("Error, please enter a valid number of players");
			getPlayers();
		}
		System.out.println();
	}
	
}
