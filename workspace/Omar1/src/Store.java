
public class Store 
{
    private String name;
    private Ski s1;
    private Ski s2;
    
    public Store(String inName, Ski in1, Ski in2)
    {
        name = inName;
        s1 = in1;
        s2 = in2;
    }
    
    public double getAvgRating()
    {
    	double avgRating;
    	avgRating = (s1.getStars()+s2.getStars())/(s1.getReviews()+s2.getReviews());
    	return avgRating;
    }
    
    public void printStats()
    {
        System.out.println(name + ":");
        System.out.println("  Average Ski Rating: " + getAvgRating());
        System.out.println("  Skis:");
        s1.printStats();
        s2.printStats();
    }
}
