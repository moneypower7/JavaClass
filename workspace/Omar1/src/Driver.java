
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ski ski1 = new Ski("Roger");
		Ski ski2 = new Ski("John 1000");
		ski1.addCustReview(3);
		ski1.addCustReview(4);
		ski1.addCustReview(5);
		ski1.addCustReview(1);
		ski2.addCustReview(3);
		ski2.addCustReview(4);
		ski2.addCustReview(5);
		ski2.addCustReview(4);
		Store store1 = new Store("Omar Shop",ski1,ski2);
		store1.printStats();
	}

}
