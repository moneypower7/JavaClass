
public class Player {
	// Instance Variables
	private String name;
	private int atBats, hits;

	// Constructor
	public Player(String inName) {
		name = inName;
	}

	// Methods
	public void addAtBats(int inAtBats) {
		atBats = inAtBats;
	}

	public void addHits(int inHits) {
		hits = inHits;
	}

	public int getAtBats() {
		return atBats;
	}

	public int getHits() {
		return hits;
	}

	public void printStats() {
		System.out.println("    " + name + "---> At Bats: " + atBats + ", Hits: " + hits + ", Batting Avg: "
				+ (double) hits / (double) atBats);
	}
}
