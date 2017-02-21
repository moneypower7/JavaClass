
public class Ski {
	private String name;
	private double totalStars;
	public int reviews; // Total number of reviews
	double avgReview;

	// constructor
	public Ski(String inName) {
		name = inName;
		reviews = 0;

	}

	// methods
	public void addCustReview(double stars) {
		totalStars += stars;
		reviews += 1;
	}
	public int getReviews(){
		return reviews;
	}
	public double getStars(){
		return totalStars;
	}

	// stats method
	public void printStats() {
		avgReview = totalStars/reviews;
		System.out.println("Name: " + name);
		System.out.println("Average Rating: " + avgReview);
		System.out.println("Total Number of Reviews: " + reviews);

	}

}
