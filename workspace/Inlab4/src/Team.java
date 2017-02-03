
public class Team {
	// Instance Variables
	private String teamName;
	private int atBats, hits;
	private Player p1;
	private Player p2;
	private Player p3;

	// Constructor
	public Team(String inTeamName, Player inP2, Player inP1, Player inP3) {
		teamName = inTeamName;
		p2 = inP2;
		p1 = inP1;
		p3 = inP3;
		atBats = p1.getAtBats() + p2.getAtBats() + p3.getAtBats();
		hits = p1.getHits() + p2.getHits() + p3.getHits();
	}

	// Methods
	public void printStats() {
		System.out.println(teamName + ":");
		System.out.println("  At Bats: " + atBats);
		System.out.println("  Hits: " + hits);
		System.out.println("  Batting Avg: " + (double) hits / (double) atBats);
		System.out.println("  Players:");
		p2.printStats();
		p1.printStats();
		p3.printStats();
	}
}
